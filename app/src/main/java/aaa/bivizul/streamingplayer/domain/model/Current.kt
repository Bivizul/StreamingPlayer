package aaa.bivizul.streamingplayer.domain.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Current(
    @SerializedName("cdnvideo")
    val cdnvideo: Int? = null,
    @SerializedName("desc")
    val desc: String? = null,
    @SerializedName("rating")
    val rating: Int? = null,
    @SerializedName("timestart")
    val timestart: Int? = null,
    @SerializedName("timestop")
    val timestop: Int? = null,
    @SerializedName("title")
    val title: String? = null
)