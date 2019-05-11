package com.ucsdextandroid1.musicsearch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;
import com.ucsdextandroid1.musicsearch.data.SongItem;

public class MusicDetailsActvity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_music_details);

        imageView = findViewById(R.id.music_detail_image);
        textView = findViewById(R.id.music_details);


        SongItem songItem = getIntent().getParcelableExtra("song");

        if (songItem != null ){
            textView.setText(songItem.getAlbumName() + " " + songItem.getArtistName());
            Picasso.get().load(.into(imageView);
        }
    }
}
