package aaa.bivizul.streamingplayer.domain.repository

import aaa.bivizul.streamingplayer.domain.model.Playlist
import retrofit2.Response

interface StreamRepository {

    suspend fun getPlaylist(): Response<Playlist>

}