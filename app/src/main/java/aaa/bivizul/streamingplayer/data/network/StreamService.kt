package aaa.bivizul.streamingplayer.data.network

import aaa.bivizul.streamingplayer.domain.model.Playlist
import retrofit2.Response
import retrofit2.http.GET

interface StreamService {

    @GET("playlist/channels.json")
    suspend fun getPlaylist(): Response<Playlist>

}