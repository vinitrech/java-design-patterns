package behavioral.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
    SongIterator iterator70Songs;
    SongIterator iterator80Songs;
    SongIterator iterator90Songs;

    public DiscJockey(SongIterator iterator70Songs, SongIterator iterator80Songs, SongIterator iterator90Songs) {
        this.iterator70Songs = iterator70Songs;
        this.iterator80Songs = iterator80Songs;
        this.iterator90Songs = iterator90Songs;
    }

    /* public void showTheSongs() {
        ArrayList songs70 = songsOfThe70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for (int i = 0; i < songs70.size(); i++) {
            SongInfo bestSongs = (SongInfo) songs70.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        SongInfo[] songs80 = songsOfThe80s.getBestSongs();

        System.out.println("\nSongs of the 80s\n");

        for (int i = 0; i < songs80.length; i++) {
            SongInfo bestSongs = songs80[i];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        Hashtable<Integer, SongInfo> songs90 = songsOfThe90s.getBestSongs();

        System.out.println("\nSongs of the 90s\n");

        for (Enumeration<Integer> e = songs90.keys(); e.hasMoreElements();) {
            SongInfo bestSongs = songs90.get(e.nextElement()); 

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
    } */

    public void showTheSongs(){
        Iterator songs70s = iterator70Songs.createIterator();
        Iterator songs80s = iterator80Songs.createIterator();
        Iterator songs90s = iterator90Songs.createIterator();

        System.out.println("\nSongs of the 70s\n");
        printTheSongs(songs70s);

        System.out.println("\nSongs of the 80s\n");
        printTheSongs(songs80s);

        System.out.println("\nSongs of the 90s\n");
        printTheSongs(songs90s);
    }

    public void printTheSongs(Iterator songs){
        while(songs.hasNext()){
            SongInfo songInfo = (SongInfo) songs.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
