package com.msamil.MsaStudioNewsApp.view

import android.content.Context
import android.os.Bundle
import android.view.*
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.msamil.MsaStudioNewsApp.R
import com.msamil.MsaStudioNewsApp.adapter.NewsAdapter
import com.msamil.MsaStudioNewsApp.viewmodel.FeedViewModel
import kotlinx.android.synthetic.main.fragment_feed.*


class FeedFragment : Fragment() {
    private lateinit var viewModel : FeedViewModel
    private var  newsAdapter = NewsAdapter(arrayListOf())
    var countrylink =   ""
    var apiKey = "Your-Api-Key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var keyboard = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager


        val dataSh = activity!!.getSharedPreferences("com.msamil.newspaperfinal",Context.MODE_PRIVATE)
        var countrycode = dataSh.getString("code","country=us&")
        var category = dataSh.getString("cate1","")
        countrylink = "top-headlines?${countrycode}${category}apiKey=YOUR-API-KEY"
        viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
        viewModel.refreshData(countrylink)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = newsAdapter
        dataSh.edit().putString("data",countrylink).apply()


        val leftin = AnimationUtils.loadAnimation(activity!!.applicationContext,R.anim.slide_in_left)
        val slideUp = AnimationUtils.loadAnimation(activity!!.applicationContext,R.anim.slide_up)


            kategoriCountry.setOnClickListener {
                val action = FeedFragmentDirections.actionFeedFragment2ToCountrySelectFragment()
                Navigation.findNavController(it).navigate(action)
            }
             val sds =dataSh.getString("data","")
        val searchLanguage=dataSh.getString("language","en")

            kategoriAll.setOnClickListener {

                category = ""
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

            kategoriSport.setOnClickListener {

                category = "category=sports&"
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

            kategoriTech.setOnClickListener {

                category = "category=technology&"
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

            kategoriHealth.setOnClickListener {

                category = "category=health&"
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

            kategoriScience.setOnClickListener {

                category = "category=science&"
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

            kategoriBusi.setOnClickListener {

                category = "category=business&"
                dataSh.edit().putString("cate1",category).apply()
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }

        searchBar2.visibility = View.GONE
        searchBar2.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                ddd()
                return@OnKeyListener true
            }
            false
        })

        searchButton2.setOnClickListener {
            if ( searchBar2.visibility == View.GONE){
                scroll2.startAnimation(slideUp)
                scroll2.visibility = View.GONE
                searchBar2.visibility = View.VISIBLE
                searchBar2.startAnimation(leftin)
                searchBar2.requestFocus()
                keyboard.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, InputMethodManager.HIDE_IMPLICIT_ONLY)

                //imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
            } else{
                if (searchBar2.text.equals("")){
                    Toast.makeText(activity!!,"Please Write A Topic",Toast.LENGTH_SHORT).show()
                }else{
                    val topic = searchBar2.text.toString().toString()
                    countrylink = "everything?q=${topic}&language=${searchLanguage}&apiKey=${apiKey}"
                    viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                    viewModel.refreshData(countrylink)
                    recyclerView.layoutManager = LinearLayoutManager(context)
                    recyclerView.adapter = newsAdapter
                    dataSh.edit().putString("data",countrylink).apply()
                }
                scroll2.visibility = View.VISIBLE
                scroll2.startAnimation(leftin)
                searchBar2.startAnimation(slideUp)
                searchBar2.visibility = View.GONE
                searchBar2.text.clear()
                keyboard.toggleSoftInput(InputMethodManager.HIDE_NOT_ALWAYS, InputMethodManager.HIDE_IMPLICIT_ONLY)

            }
        }

            if (sds.equals("")){
                countrylink = "top-headlines?${countrycode}${category}apiKey=${apiKey}"
            }else{
                countrylink = sds!!
            }

        viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
        viewModel.refreshData(countrylink)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = newsAdapter

        swipeRefreshLayout.setOnRefreshListener {
            recyclerView.visibility = View.GONE
            feedError.visibility = View.GONE
            feedLoad.visibility = View.VISIBLE
            viewModel.refreshData(countrylink)
            swipeRefreshLayout.isRefreshing = false
        }

        observeLiveData()
    }

    private fun observeLiveData(){
        viewModel.newsData.observe(viewLifecycleOwner, Observer {
            it?.let {
                feedError.visibility = View.GONE
                recyclerView.visibility = View.VISIBLE
                feedLoad.visibility = View.GONE
                newsAdapter.updateNewsList(it.articles)
            }
        })

        viewModel.newsError.observe(viewLifecycleOwner, Observer {error ->
            error?.let {
                if (it) {
                    feedError.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                    feedLoad.visibility = View.GONE
                } else{
                    feedError.visibility = View.GONE
                }
            }
        })

        viewModel.newsLoading.observe(viewLifecycleOwner, Observer {loading ->
            loading?.let {
                if (it){
                    feedError.visibility = View.GONE
                    recyclerView.visibility = View.GONE
                    feedLoad.visibility = View.VISIBLE
                }else{
                feedLoad.visibility = View.GONE
                }
            }
        })
    }

    fun ddd(){
        val leftin = AnimationUtils.loadAnimation(activity!!.applicationContext,R.anim.slide_in_left)
        var keyboard = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        val slideUp = AnimationUtils.loadAnimation(activity!!.applicationContext,R.anim.slide_up)

        val dataSh = activity!!.getSharedPreferences("com.msamil.newspaperfinal",Context.MODE_PRIVATE)
        val searchLanguage=dataSh.getString("language","en")

        if ( searchBar2.visibility == View.GONE){
            scroll2.startAnimation(slideUp)
            scroll2.visibility = View.GONE
            searchBar2.visibility = View.VISIBLE
            searchBar2.startAnimation(leftin)
            searchBar2.requestFocus()
            keyboard.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, InputMethodManager.HIDE_IMPLICIT_ONLY)

            //imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
        } else{
            if (searchBar2.text.toString().equals("")){
                Toast.makeText(activity!!,"Please Write A Topic",Toast.LENGTH_SHORT).show()
            }else{
                val topic = searchBar2.text.toString()
                countrylink = "everything?q=${topic}&language=${searchLanguage}&apiKey=${apiKey}"
                viewModel=ViewModelProviders.of(this).get(FeedViewModel::class.java)
                viewModel.refreshData(countrylink)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = newsAdapter
                dataSh.edit().putString("data",countrylink).apply()
            }
            scroll2.visibility = View.VISIBLE
            scroll2.startAnimation(leftin)
            searchBar2.startAnimation(slideUp)
            searchBar2.visibility = View.GONE
            searchBar2.text.clear()
            keyboard.toggleSoftInput(InputMethodManager.HIDE_NOT_ALWAYS, InputMethodManager.HIDE_IMPLICIT_ONLY)

        }
    }
}
