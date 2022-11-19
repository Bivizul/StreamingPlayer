package aaa.bivizul.streamingplayer.domain.model

import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Playlist(
    @SerializedName("channels")
    val channels: List<Channel?>? = null,
    @SerializedName("ckey")
    val ckey: String? = null,
    @SerializedName("valid")
    val valid: Int? = null
)