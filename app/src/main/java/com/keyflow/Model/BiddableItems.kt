import com.google.gson.annotations.SerializedName

data class BiddableItems(

    @SerializedName("presetBidAmountPreset") val presetBidAmountPreset: List<PresetBidAmountPreset>,
    @SerializedName("defaultIndexBidAmount") val defaultIndexBidAmount: Int,
    @SerializedName("recommendedIndexBidAmount") val recommendedIndexBidAmount: Int,
    @SerializedName("kfChargeOnlyReservationFee") val kfChargeOnlyReservationFee: Boolean,
    @SerializedName("name") val name: String,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("id") val id: Int,
    @SerializedName("purchaseInstructions") val purchaseInstructions: String,
    @SerializedName("iconUrl") val iconUrl: String
)