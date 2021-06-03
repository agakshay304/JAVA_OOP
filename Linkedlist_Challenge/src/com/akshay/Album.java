package com.akshay;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String Name;
    private String Artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        Name = name;
        Artist = artist;
        this.songs = new ArrayList<>();
    }

        public boolean addsong(String title,double duration)
        {
            if((findsong(title)==null))
            {
                this.songs.add(new Song(title,duration));
                return true;
            }
                return false;

    }

        private Song findsong(String title) {

        for(Song checkedsong: this.songs)
        {
            if(checkedsong.getTitle().equals(title))
            {
                return checkedsong;
            }
        }
        return null;
        }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >=0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findsong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
