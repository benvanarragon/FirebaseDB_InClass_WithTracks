package com.example.firebasedb_inclass;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Artist {
    private String artistId;
    private String artistName;
    private String artistGenre;

    public Artist(){
        //require empty constructor
    }

    public Artist(String artistId, String artistName, String artistGenre){
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId(){
        return artistId;
    }
    public String getArtistName(){
        return artistName;
    }

    public String getArtistGenre(){
        return artistGenre;
    }

}
