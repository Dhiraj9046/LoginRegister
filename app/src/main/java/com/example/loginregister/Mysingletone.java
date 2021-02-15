package com.example.loginregister;


import android.content.Context;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;

public class Mysingletone {

    private static Mysingletone mInstance;
    private RequestQueue mRequestQueu;
    private Context mCtx;

    public Mysingletone(Context mCtx) {
        this.mCtx = mCtx;
    }

    public RequestQueue getmRequestQueu(){
        if ( mRequestQueu == null) {
            Cache cache = new DiskBasedCache(mCtx.getCacheDir(), maxCacheSizelilnBytes: 1024*1024);
            Network network = new BasicNetwork(new HurlStack());
            mRequestQueu = new RequestQueue(cache, network);
            mRequestQueu = Volley.newRequestQueue(mCtx.getApplicationContext());
        }

        return mRequestQueu;
    }
}
