import java.util.ArrayList;

//can have zero or many songs
//its songs must already be in the music player
public class Playlist {
    //attr
    private String name;
    private ArrayList<Song> songList;

    //cons
    public Playlist(String name) {
        this.name = name;
        this.songList = new ArrayList<Song>();
    }

    //getters

    //setters
    public void addSong(Song song) {
        //put something here
        this.songList.add(song);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Song> getSongList() {
        return this.songList;
    }

}
