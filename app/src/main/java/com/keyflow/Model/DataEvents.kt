import com.google.gson.annotations.SerializedName

data class DataEvents(

    @SerializedName("status") val status: Int,
    @SerializedName("data") val data: Data,
    @SerializedName("serverTime") val serverTime: String,
    @SerializedName("pagination") val pagination: Pagination
)