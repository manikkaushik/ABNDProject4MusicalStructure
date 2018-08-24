package com.example.android.abndproject4musicalstructure;

public class Artist {
    private String Artist;

    private String SongName;

    private int mImageResourceId;


    public Artist(String Nameofartist, String Nameofsong, int imageResourceId) {
        Artist = Nameofartist;
        SongName = Nameofsong;
        mImageResourceId = imageResourceId;
    }
    public String getNameofartist() {
        return Artist;
    }
    public String getNameofsong() {
        return SongName;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
}



