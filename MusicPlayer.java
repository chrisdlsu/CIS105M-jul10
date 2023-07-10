import java.util.ArrayList;

//up to 5 playlists only
// can have zero or many songs
public class MusicPlayer {
    //ATTR
    private String deviceName;
    private ArrayList<Song> songList = new ArrayList<Song>();
    private ArrayList<Playlist> playlistList;

    //CONS
    public MusicPlayer(String deviceName) {
        this.deviceName = deviceName;
        playlistList = new ArrayList<Playlist>();
    }
    //TEST METHODS
    public int checkPlaylistTEST() {
        return this.playlistList.size();
    }
    
    //TEST return the name of the indexed playlist
    public String getPlaylistNameTEST(int index) {
        return this.playlistList.get(index).getName();
    }
    //METHODS
    public boolean createPlaylist(String name) {
        // things go here
        // use the constructor in the playlist class to instantiate a playlist
        //add this new playlsit object in the Playlist arraylist
        // if there is such a playlist that exists, return true
        // if there is not, return false?
        //new Playlist(name);
        //this.playlistList.add(new Playlist(name));
        
        /* new Playlist(name);
        playlistList.add(Playlist.getName());
        boolean x;
        return x; */

        /* boolean doesPlaylistExists;
        doesPlaylistExists = playlistList.contains(name);
        if () { //if there is such a playlist
            return true;
        } else {
            return false;
        } */

        if (this.playlistList.size() <= 4) { 
            this.playlistList.add(new Playlist(name));
            return true;
        } else {
            return false;
        }
    }
    //GETTERS

    //SETTERS
    public void addSong(Song song) {
        // this method is for putting songs in this Music Player
        this.songList.add(song);
    }
    public void addSong(int songIndex, int playlistIndex) {
        // this method is to place existing songs into existing playlists
        
        // what is existing songs part?
        //songList.get(songIndex);

        // what is the exising playlist part?
        //playlistList.get(playlistIndex);

        //what is the add the exisiting song into an existing playlist part?
        this.playlistList.get(playlistIndex).addSong(this.songList.get(songIndex));

        //this.playlistList.get(playlistIndex).addSong(this.songList.get(songIndex));
        //this.songList.get(songIndex);
    }
    public void playSong(int index) {
        //Now playing
        System.out.println(this.deviceName + " is now playing " + songList.get(index).getTitle() + "...");
        //Artist
        System.out.println("Song by " + songList.get(index).getArtist());
        
        //GENRE and PLAYTIME
        //HOW TO GET THE PLAYTIME
        // need to ge the number of characters in a line
        // add all of the characters in all lines
        // divide as float?
        int lyricLine = songList.get(index).getLyrics().size(); //gets the number of lines
        float characterTally = 0f; // holds the number of characters total
        for (int z = 0; z < lyricLine; z++) {
            //System.out.println(songList.get(index).getLyrics().get(z).length());
            characterTally = characterTally + songList.get(index).getLyrics().get(z).length();
        }
       // System.out.println(characterTally); //TEST
        //System.out.println(characterTally/2f); //TEST

        System.out.println("Genre: " + songList.get(index).getGenre() + " | Play time: " + characterTally/2f);
        //System.out.println("Genre: " + songList.get(index).getGenre() + " | Play time: " + songList.get(index).getPlayTime());
        //System.out.println(songList.get(index).getPlayTime());

        System.out.println("==========");//Visual break

        //System.out.println(songList.get(index).getLyrics().size()); // TEST Size is 7
        //System.out.println(songList.get(index).getLyrics()); // Lyrics as array
        
        // LYRICS
        for (int y = 0; y < lyricLine; y++ ) {
            System.out.println(songList.get(index).getLyrics().get(y)); // prints a lyric line per line until the entire stanza is printed
        }
        System.out.println("");
    }
    public void playPlaylist(int index) {
        //what are the components to this?
        // a) the created and therefore indexed playlist in this player
        // b) the song(s) stored in that playlist

        //a
        //this.playlistList.get(index);

        //b
        //this.playlistList.get(index).getSongList();   
        
        System.out.println(this.deviceName + " is now playing " + this.playlistList.get(index).getName() + "...");
        System.out.println("");//spacer
        //this.playlistList.get(index).getSongList();

        //get the songs
        //System.out.println(this.playlistList.get(index).getSongList()); //TEST print of array
        int listSize = this.playlistList.get(index).getSongList().size(); //gets the number of songs in the playlist 
        //System.out.println(listSize); //TEST

        for (int i = 0; i <= listSize-1; i++) {
            String thisTitle = this.playlistList.get(index).getSongList().get(i).getTitle();
            String thisArtist = this.playlistList.get(index).getSongList().get(i).getArtist();
            String thisGenre = this.playlistList.get(index).getSongList().get(i).getGenre();
            int thisLyricLine = this.playlistList.get(index).getSongList().get(i).getLyrics().size();//gets the number of lines of the stanza
            float thisCharacterTally = 0f;

            for (int r = 0; r < thisLyricLine; r++) {
                thisCharacterTally = thisCharacterTally + this.playlistList.get(index).getSongList().get(i).getLyrics().get(r).length();
            }

            System.out.println(thisTitle + " by " + thisArtist); //song name BY artist
            System.out.println("Genre: " + thisGenre + " | Play time: " + thisCharacterTally/2f); //genre AND Playtime
            System.out.println("==========");
            //System.out.println(thisLyricLine);

            //next: print everyline
            for (int n = 0; n < thisLyricLine; n++) {
                System.out.println(this.playlistList.get(index).getSongList().get(i).getLyrics().get(n));
                //this.playlistList.get(index).getSongList().get(i).getLyrics().get(n);
            }// belongs to the for loop of lyric printing
            System.out.println("");//spacer
        } //belongs to the for loop of song printing

        //System.out.println("");//spacer


        

        // things go here
        // for every song that's in here, play it out
        /* this.playlistList.get(index).size();
        int howManySongs = this.playlistList.size(); // get the number of songs

        for (int i = 0; i <= howManySongs; i++ ) {
            playSong(i);
        } */

    }
    
}
