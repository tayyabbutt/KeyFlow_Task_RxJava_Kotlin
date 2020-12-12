import com.google.gson.annotations.SerializedName

data class Pagination (

	@SerializedName("currentPageId") val currentPageId : Int,
	@SerializedName("maxPageSize") val maxPageSize : Int,
	@SerializedName("count") val count : Int,
	@SerializedName("pageIds") val pageIds : List<String>,
	@SerializedName("currentPage") val currentPage : Int,
	@SerializedName("pageSize") val pageSize : Int,
	@SerializedName("totalPages") val totalPages : Int,
	@SerializedName("self") val self : String,
	@SerializedName("last") val last : String,
	@SerializedName("next") val next : String
)