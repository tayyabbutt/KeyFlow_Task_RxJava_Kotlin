package com.keyflow.adapter

import Events
import Venues
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.keyflow.R
import com.keyflow.constants.URLs
import com.keyflow.utils.GeneralUtility
import kotlinx.android.synthetic.main.adapter_item_layout.view.*

class EventAdapter(
    private val event: List<Events>,
    var context: Context
) :
    RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.adapter_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return event.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(event[position], context)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(event: Events, context: Context) {
            itemView.event_name.text = event.name
            itemView.time.text = GeneralUtility.parseTtime(
                event.startTime,
                "yyyy-MM-dd'T'HH:mm:ssZZZZZ"
            ) + " - " + GeneralUtility.parseTtime(event.endTime, "yyyy-MM-dd'T'HH:mm:ssZZZZZ")
            val date = GeneralUtility.parseTdate(event.startTime, "yyyy-MM-dd'T'HH:mm:ssZZZZZ")
            val dateParts = date!!.split(",".toRegex()).toTypedArray()
            val day = dateParts[0]
            val month = dateParts[1]
            val dayDate = dateParts[2]
            itemView.month.text = month
            itemView.date.text = dayDate
            itemView.day.text = day
            Glide.with(context)
                .load(URLs.getInstance(context).IMAGE_BASE_URL + event.uri)
                .apply(RequestOptions().placeholder(R.drawable.ic_image_loading_placeholder))
                .into(itemView.event_image)
            itemView.event_card.setOnClickListener {
                Toast.makeText(
                    context,
                    "Clicked on event card: ID: " + event.id,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}