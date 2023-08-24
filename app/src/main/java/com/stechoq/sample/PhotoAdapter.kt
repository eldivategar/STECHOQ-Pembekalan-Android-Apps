package com.stechoq.sample


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stechoq.sample.model.Photo
//import kotlinx.android.synthetic.main.item_photo.view.*

class PhotoAdapter(private val photos: List<Photo>) : RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {

    class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoImage: ImageView = itemView.findViewById(R.id.photoImage)
        val photoTitle: TextView = itemView.findViewById(R.id.photoTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return PhotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = photos[position]
        with(holder) {
            photoTitle.text = photo.title
            Glide.with(itemView.context)
                .load(photo.url)
                .into(photoImage)
        }
    }

    override fun getItemCount(): Int {
        return photos.size
    }
}


