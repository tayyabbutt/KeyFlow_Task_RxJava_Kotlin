import com.google.gson.annotations.SerializedName

data class Venues (

	@SerializedName("venueLegalDisclaimerReceipt") val venueLegalDisclaimerReceipt : String,
	@SerializedName("venueLocation") val venueLocation : VenueLocation,
	@SerializedName("accountCurrency") val accountCurrency : String,
	@SerializedName("keyflowCityId") val keyflowCityIdflowCityId : Int,
	@SerializedName("venueMusic") val venueMusic : List<String>,
	@SerializedName("venueTZ") val venueTZ : String,
	@SerializedName("venueBidRateMessage") val venueBidRateMessage : String,
	@SerializedName("venueAtmosphere") val venueAtmosphere : List<String>,
	@SerializedName("venuePhone") val venuePhone : String,
	@SerializedName("venueImages") val venueImages : List<String>,
	@SerializedName("venueEmail") val venueEmail : String,
	@SerializedName("venueDescription") val venueDescription : String,
	@SerializedName("venueWebsite") val venueWebsite : String,
	@SerializedName("venueRglInfoColor") val venueRglInfoColor : String,
	@SerializedName("venueUrl") val venueUrl : String,
	@SerializedName("venueName") val venueName : String,
	@SerializedName("venueBidTimeMessage") val venueBidTimeMessage : String,
	@SerializedName("venueDoorPolicy") val venueDoorPolicy : String,
	@SerializedName("venueLogo") val venueLogo : String,
	@SerializedName("venueId") val venueId : Int,
	@SerializedName("venueSortRank") val venueSortRank : Int,
	@SerializedName("venueRglInfoMessage") val venueRglInfoMessage : String,
	@SerializedName("venueUpcomingEventsCount") val venueUpcomingEventsCount : Int
)