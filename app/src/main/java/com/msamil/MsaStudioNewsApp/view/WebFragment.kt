package com.msamil.MsaStudioNewsApp.view


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.msamil.MsaStudioNewsApp.R

class WebFragment : Fragment() {
    private var newsUrl = "google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_web, container, false)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myWebView: WebView = view.findViewById(R.id.webView)
        myWebView.webViewClient = WebViewClient()
        arguments?.let {
            newsUrl = WebFragmentArgs.fromBundle(it).Url2Web
            myWebView.settings.javaScriptEnabled = true
            myWebView.loadUrl(newsUrl)


        }
    }
}