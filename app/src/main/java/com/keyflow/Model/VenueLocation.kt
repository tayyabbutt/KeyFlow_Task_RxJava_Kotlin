import com.google.gson.annotations.SerializedName

data class VenueLocation (

	@SerializedName("locationCity") val locationCity : String,
	@SerializedName("locationPlaceID") val locationPlaceID : String,
	@SerializedName("locationCoordinates") val locationCoordinates : List<Double>,
	@SerializedName("locationZoom") val locationZoom : Int,
	@SerializedName("locationReference") val locationReference : String,
	@SerializedName("locationCountry") val locationCountry : String,
	@SerializedName("locationCountryCode") val locationCountryCode : String,
	@SerializedName("locationAddress") val locationAddress : String
)