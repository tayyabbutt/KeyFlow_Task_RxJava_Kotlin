package com.keyflow.activities

import DataEvents
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaopiz.kprogresshud.KProgressHUD
import com.keyflow.R
import com.keyflow.adapter.EventAdapter
import com.keyflow.constants.URLs
import com.keyflow.network.RetrofitClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var progress: KProgressHUD

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
        getEvents()
    }


    private fun setListners() {
        out_btn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getEvents() {
        showProgress()
        // Retrofit network call using RxJava.
        RetrofitClient.buildService()
            .getEvents(URLs.getInstance(this).EVENT)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
    }

    private fun onResponse(response: DataEvents) {
        hideProgress()
        if (response.status == 200) {
            recycler_view.visibility = View.VISIBLE
            issue.visibility = View.GONE
            recycler_view.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter =
                    EventAdapter(response.data.events, response.data.venues, this@MainActivity)
            }
        } else {
            issue.visibility = View.VISIBLE
            recycler_view.visibility = View.GONE
        }
    }

    private fun onFailure(t: Throwable) {
        hideProgress()
        issue.visibility = View.VISIBLE
        recycler_view.visibility = View.GONE
        issue.text = t.message
        Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
    }

    fun showProgress() {
        progress = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setLabel("Please wait...")
            .setAnimationSpeed(2)
            .show()
    }

    fun hideProgress() {
        progress.dismiss()
    }

}