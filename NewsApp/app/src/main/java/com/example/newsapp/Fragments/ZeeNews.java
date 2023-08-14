package com.example.newsapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;

public class ZeeNews extends Fragment {

    public ZeeNews() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_zee_news, container, false);

        WebView webView = view.findViewById(R.id.webViewZee);
        webView.loadUrl("https://zeenews.india.com/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}