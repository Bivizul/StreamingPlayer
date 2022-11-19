package aaa.bivizul.streamingplayer.data.repository

import aaa.bivizul.streamingplayer.data.network.StreamService
import aaa.bivizul.streamingplayer.domain.model.Playlist
import aaa.bivizul.streamingplayer.domain.repository.StreamRepository
import retrofit2.Response
import javax.inject.Inject

class StreamRepositoryImpl @Inject constructor(private val streamService: StreamService) :
    StreamRepository {

    override suspend fun getPlaylist(): Response<Playlist> {
        return streamService.getPlaylist()
    }

}