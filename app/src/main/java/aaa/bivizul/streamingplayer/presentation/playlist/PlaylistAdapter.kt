package aaa.bivizul.streamingplayer.presentation.playlist

import aaa.bivizul.streamingplayer.databinding.ItemPlaylistBinding
import aaa.bivizul.streamingplayer.domain.model.Channel
import aaa.bivizul.streamingplayer.domain.model.Playlist
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Channel>() {
    override fun areItemsTheSame(oldItem: Channel, newItem: Channel) =
        oldItem.hashCode() == newItem.hashCode()

    override fun areContentsTheSame(oldItem: Channel, newItem: Channel) =
        oldItem == newItem
}

class PlaylistAdapter :
    ListAdapter<Channel, PlaylistAdapter.PlaylistViewHolder>(DIFF_CALLBACK) {

    inner class PlaylistViewHolder(val binding: ItemPlaylistBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val binding = ItemPlaylistBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PlaylistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val item = getItem(position)

        with(holder.binding) {
            tvTitle.text = item.nameEn

        }
    }

}