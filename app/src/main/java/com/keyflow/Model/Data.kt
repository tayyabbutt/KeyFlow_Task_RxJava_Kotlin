import com.google.gson.annotations.SerializedName

data class Data(

    @SerializedName("events") val events: List<Events>,
    @SerializedName("recommendedEventIds") val recommendedEventIds: List<String>,
    @SerializedName("hotEventIds") val hotEventIds: List<String>,
    @SerializedName("discoverEventIds") val discoverEventIds: List<Int>,
    @SerializedName("venues") val venues: List<Venues>,
    @SerializedName("biddableItems") val biddableItems: List<BiddableItems>,
    @SerializedName("biddableEventsExistForTonight") val biddableEventsExistForTonight: Boolean
)