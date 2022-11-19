package aaa.bivizul.streamingplayer.domain.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ForeignPlayer(
    @SerializedName("sdk")
    val sdk: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("valid_from")
    val validFrom: Int? = null
)