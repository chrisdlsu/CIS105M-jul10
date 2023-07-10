import java.util.ArrayList;


// each song has a playing time, in seconds, computed as half the number of characters of all the lyric lines of the song.
public class Song {
    //attr
    private String title;
    private String artist;
    private String genre;
    private ArrayList<String> lyrics;
    private float playTime;

    //cons
    public Song(String title, String artist, String genre, ArrayList<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
    }
    //getters
    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public String getGenre() {
        return this.genre;
    }
    public ArrayList<String> getLyrics() {
        return this.lyrics;
    }
    public float getPlayTime() {
        return this.playTime;
        // "Additionally, each song has a playing time, in seconds, computed as half the number of characters of all the lyric lines of the song."
        //half of the number of characters of the lyrics
        //get the length of the lyrcis string
        //then compute for half
        //ArrayList<String> a = this.getLyrics();
        //float x;
        //return this.lyrics.size(); // doing this just returns the number of lines, which is 7
        //return this.playTime;

    }
    //setters
}
