package com.example.android.abndproject4musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        // Create a list of songs
        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist("ARTIST1", "Song1", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST2", "Song2", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST3", "Song3", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST4", "Song4", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST5", "Song5", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST6", "Song6", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST7", "Song7", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST8", "Song8", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST9", "Song9", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("ARTIST10", "Song10", R.drawable.ic_launcher_foreground));

        ArtistAdapter adapter =
                new ArtistAdapter(this, artists);
        ListView listView = (ListView) findViewById(R.id.artists_list);
        listView.setAdapter(adapter);
    }
}
