package aaa.bivizul.streamingplayer.domain.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Channel(
    @SerializedName("address")
    val address: String? = null,
    @SerializedName("cdn")
    val cdn: String? = null,
    @SerializedName("current")
    val current: Current? = null,
    @SerializedName("drm_status")
    val drmStatus: Int? = null,
    @SerializedName("epg_id")
    val epgId: Int? = null,
    @SerializedName("foreign_player")
    val foreignPlayer: ForeignPlayer? = null,
    @SerializedName("foreign_player_key")
    val foreignPlayerKey: Boolean? = null,
    @SerializedName("hasEpg")
    val hasEpg: Boolean? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("is_federal")
    val isFederal: Boolean? = null,
    @SerializedName("is_foreign")
    val isForeign: Boolean? = null,
    @SerializedName("name_en")
    val nameEn: String? = null,
    @SerializedName("name_ru")
    val nameRu: String? = null,
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("owner")
    val owner: String? = null,
    @SerializedName("region_code")
    val regionCode: Int? = null,
    @SerializedName("tz")
    val tz: Int? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("url_sound")
    val urlSound: String? = null,
    @SerializedName("vitrina_events_url")
    val vitrinaEventsUrl: String? = null
)