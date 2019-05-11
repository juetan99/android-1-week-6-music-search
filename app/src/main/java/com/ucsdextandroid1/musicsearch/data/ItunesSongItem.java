package com.ucsdextandroid1.musicsearch.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSongItem implements SongItem {

    //TODO add all the members to this class with proper serialized names
    @SerializedName("trackId")
    private long trackId;
    @SerializedName("trackName")
    private String trackName;
    @SerializedName("artistName")
    private String artistName;
    @SerializedName("collectionName")
    private String albumName;
    @SerializedName("artistViewUrl")
    private String artworkUrl;
    @SerializedName("previewUrl")
    private String previewUrl;
    @SerializedName("trackTimeMillis")
    private long trackTime;

    @Override
    public long getTrackId() {
        return trackId;
    }

    @Override
    public String getTrackName() {
        return trackName;
    }

    @Override
    public String getArtistName() {
        return artistName;
    }

    @Override
    public String getAlbumName() {
        return albumName;
    }

    @Override
    public String getArtworkUrl() {
        return artworkUrl;
    }

    @Override
    public String getPreviewUrl() {
        return previewUrl;
    }

    @Override
    public long getTrackTime() {
        return trackTime/1000;
    }


}
