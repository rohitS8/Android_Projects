package com.example.newsapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;

public class TheHindu extends Fragment {

    public TheHindu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_the_hindu, container, false);

        WebView webView = view.findViewById(R.id.webViewTheHindu);
        webView.loadUrl("https://www.thehindu.com/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}