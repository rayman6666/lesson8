package ru.mirea.komaristyi.yandexmaps;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "98cbdd0b-0aae-4c90-8f52-872ac934dee4";
    @Override
    public void onCreate() {
        super.onCreate();

        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
