package com.msamil.MsaStudioNewsApp.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.msamil.MsaStudioNewsApp.R

fun ImageView.dowmloadFromUrl(url:String?,progressDrawable: CircularProgressDrawable){

    val options = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.drawable.errorviewclip)
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)

}

fun placeholderProgressBar(context: Context): CircularProgressDrawable{
    return CircularProgressDrawable(context).apply {
        strokeWidth=2f
        centerRadius=20f
        start()
    }
}