package aaa.bivizul.streamingplayer.presentation.playlist

import aaa.bivizul.streamingplayer.domain.model.Playlist
import aaa.bivizul.streamingplayer.domain.repository.StreamRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn

class PlaylistViewModel (private val streamRepository: StreamRepository) : ViewModel() {

//    private val getPhoneUseCase = GetPhoneUseCase(phoneRepository)

//    private val _phone = MutableLiveData<Phone>()
//    val phone : LiveData<Phone> = _phone
//
//    init {
//        getPhone()
//    }
//
//    fun getPhone() {
//        viewModelScope.launch(Dispatchers.IO) {
//            Log.e("qwer", "getPhone 2")
//            val response = getPhoneUseCase()
////            val response = phoneRepository.getPhone()
//            Log.e("qwer", "getPhone 3")
//            Log.e("qwer", "response : ${response.body()}")
//            if (response.isSuccessful){
//                response.body()?.let {
//                    _phone.postValue(it)
//                }
//            }
//        }
//    }

    val phone: SharedFlow<Playlist> =
        flow<Playlist> {
            streamRepository.getPlaylist()
//            getPhoneUseCase()
//            Log.e("qwer", "response : ${phoneRepository.getPhone().body()}")
        }
            .shareIn(viewModelScope, SharingStarted.Lazily, replay = 1)

}

class StreamViewModelFactory @AssistedInject constructor(
    private val streamRepository: StreamRepository,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        require(modelClass == PhoneViewModel::class)
        return PlaylistViewModel(streamRepository) as T
    }

    @AssistedFactory
    interface Factory {
        fun create(): StreamViewModelFactory
    }

}