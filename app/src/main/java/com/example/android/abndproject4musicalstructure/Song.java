package com.example.android.abndproject4musicalstructure;

public class Song {

    private String Artist;

    private String SongName;

    private int mImageResourceId;

    public Song(String Nameofartist , String Nameofsong) {
        Artist = Nameofartist;
        SongName = Nameofsong;
    }


    public Song(String Nameofartist, String Nameofsong, int imageResourceId) {
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

