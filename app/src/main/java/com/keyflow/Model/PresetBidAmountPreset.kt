import com.google.gson.annotations.SerializedName

data class PresetBidAmountPreset (

	@SerializedName("bidAmount") val bidAmount : List<Int>,
	@SerializedName("currency") val currency : String
)