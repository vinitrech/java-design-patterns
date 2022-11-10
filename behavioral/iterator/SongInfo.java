package behavioral.iterator;

public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String songName, String bandName, int yearReleased) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearReleased = yearReleased;
    }

    public String getSongName() {
        return songName;
    }
    public String getBandName() {
        return bandName;
    }
    public int getYearReleased() {
        return yearReleased;
    }
}
