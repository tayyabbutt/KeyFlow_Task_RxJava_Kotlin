import com.google.gson.annotations.SerializedName

data class Events(

    @SerializedName("video_uri") val video_uri: String,
    @SerializedName("images") val images: List<String>,
    @SerializedName("minimumAge") val minimumAge: Int,
    @SerializedName("endTime") val endTime: String,
    @SerializedName("tickets") val tickets: List<Tickets>,
    @SerializedName("venueId") val venueId: Int,
    @SerializedName("startTime") val startTime: String,
    @SerializedName("id") val id: Int,
    @SerializedName("sentTickets") val sentTickets: List<String>,
    @SerializedName("music") val music: List<String>,
    @SerializedName("description") val description: String,
    @SerializedName("name") val name: String,
    @SerializedName("doorPolicy") val doorPolicy: String,
    @SerializedName("atmosphere") val atmosphere: List<String>,
    @SerializedName("consents") val consents: List<String>,
    @SerializedName("musicIdArray") val musicIdArray: List<String>,
    @SerializedName("receivedTickets") val receivedTickets: List<String>,
    @SerializedName("vipCardStatus") val vipCardStatus: List<String>,
    @SerializedName("eventLegalDisclaimerReceipt") val eventLegalDisclaimerReceipt: String,
    @SerializedName("atmosphereIdArray") val atmosphereIdArray: List<String>,
    @SerializedName("uri") val uri: String
)