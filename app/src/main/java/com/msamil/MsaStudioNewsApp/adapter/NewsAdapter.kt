package com.msamil.MsaStudioNewsApp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.msamil.MsaStudioNewsApp.R
import com.msamil.MsaStudioNewsApp.model.Articles
import com.msamil.MsaStudioNewsApp.util.dowmloadFromUrl
import com.msamil.MsaStudioNewsApp.util.placeholderProgressBar
import com.msamil.MsaStudioNewsApp.view.FeedFragmentDirections
import kotlinx.android.synthetic.main.feed_rows.view.*

class NewsAdapter(val newsList:ArrayList<Articles>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    class NewsViewHolder(var view :View): RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.feed_rows,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.view.titleView.text = newsList[position].title
        holder.view.descripView.text = newsList[position].description
        holder.view.publisherView.text = newsList[position].source.name
        holder.view.setOnClickListener {
            val action = FeedFragmentDirections.actionFeedFragment2ToWebFragment2(newsList[position].url!!)
            Navigation.findNavController(it).navigate(action)
        }
        holder.view.theImage.dowmloadFromUrl(newsList[position].urlToImage, placeholderProgressBar(holder.view.context))
    }

    fun updateNewsList(newNewsList : List<Articles>){
        newsList.clear()
        newsList.addAll(newNewsList)
        notifyDataSetChanged()
    }
}