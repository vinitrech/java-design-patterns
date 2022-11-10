package structural.composite;

public class DiscJockey {
    SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
