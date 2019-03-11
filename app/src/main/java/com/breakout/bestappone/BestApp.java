package com.breakout.bestappone;

import android.app.Application;

import com.breakout.bestappone.api.ApiFactory;
import com.breakout.bestappone.repository.RepositoryProvider;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class BestApp extends Application {

    private static BestApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        Picasso picasso = new Picasso.Builder(this)
                .memoryCache(new LruCache(24000))
                .downloader(new OkHttp3Downloader(getCacheDir(), 25000000))
                .build()
          ;
        Picasso.setSingletonInstance(picasso);
//        Picasso.get().setIndicatorsEnabled(true);


//        RealmConfiguration configuration = new RealmConfiguration.Builder(this)
//                .rxFactory(new RealmObservableFactory())
//                .build();
//
//     Realm.setDefaultConfiguration(configuration);
        ApiFactory.recreate();
        RepositoryProvider.init();
    }

    public static BestApp getAppContext() { return sInstance; }

}




