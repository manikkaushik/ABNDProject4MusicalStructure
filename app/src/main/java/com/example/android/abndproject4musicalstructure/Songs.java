package com.example.android.abndproject4musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("ARTIST1", "Song1", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST2", "Song2", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST3", "Song3", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST4", "Song4", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST5", "Song5", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST6", "Song6", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST7", "Song7", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST8", "Song8", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST9", "Song9", R.drawable.ic_launcher_background));
        songs.add(new Song("ARTIST10", "Song10", R.drawable.ic_launcher_background));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(adapter);
    }

    public void show_artists(View view) {
        Intent Intent = new Intent(Songs.this, Artists.class);
        startActivity(Intent);
    }
}
