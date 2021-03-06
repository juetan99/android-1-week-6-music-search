package com.ucsdextandroid1.musicsearch.data;

import android.content.Context;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSearchResultsDeserialzer implements JsonDeserializer<ItunesSearchResults> {

    @Override
    public ItunesSearchResults deserialize(JsonElement json, Type typeOfT,
                                           JsonDeserializationContext context) throws JsonParseException {

        //TODO create a ItunesSearchResults to return and a list of ItunesSongItem
        ItunesSearchResults results = new ItunesSearchResults();
        List<ItunesSongItem> songs = new ArrayList<>();

        //TODO loop through all the elements in the results JsonArray and add them to the list
        JsonObject data = json.getAsJsonObject();
        JsonArray resultArray = data.get("results").getAsJsonArray();

        for (JsonElement jsonElement : resultArray){
            ItunesSongItem song = context.deserialize(jsonElement, ItunesSongItem.class);
            songs.add(song);
        }

        results.setSongs(songs);
        return results;
    }

}
