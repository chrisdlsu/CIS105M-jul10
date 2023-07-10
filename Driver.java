import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	public static void main(String args[]) {
		// creating instance of a music player
		MusicPlayer mp = new MusicPlayer("MyMusicPlayer");

		// creating instances of songs
		Song s1 = new Song(
			"Bad Habit",
			"Steve Lacy",
			"R&B",
			new ArrayList<String>(Arrays.asList(
				"I wish I knew you wanted me",
				"I wish I knew, I wish I knew you wanted me",
				"I wish I knew, I wish I knew you wanted me",
				"What you, ooh, uh, what you do?",
				"Made a move, coulda made a move",
				"If I knew I'd be with you",
				"Is it too late to pursue?")));
		
		// this is the mp.playSong(1);
		Song s2 = new Song(
			"Save Rock and Roll",
			"Fall Out Boy",
			"Pop rock",
			new ArrayList<String>(Arrays.asList(
				"I need more dreams",
				"And less life",
				"And I need that dark",
				"In a little more light",
				"I cried tears you'll never see",
				"So fuck you, you can go cry me an ocean!",
				"And leave me be")));

		Song s3 = new Song(
			"Good Morning World!",
			"BURNOUT SYNDROMES",
			"Rock",
			new ArrayList<String>(Arrays.asList(
				"Ohayou sekai",
				"Good Morning World!",
				"Dore hodo aruitarou?",
				"Ashi no itami dake ga",
				"Sono kyori wo monogataru")));

		Song s4 = new Song(
			"Tell Me Why",
			"Penpals",
			"Rock",
			new ArrayList<String>(Arrays.asList(
				"Feel no shame about shape",
				"Weather changes their phrase",
				"Even mother will show you another way",
				"So put your glasses on",
				"Nothing will be wrong",
				"There's no blame, there's no fame",
				"It's up to you, the first words should be finded",
				"Whatever holds you back, I can, I can get it off")));

		mp.addSong(s1);
		mp.addSong(s2);
		mp.addSong(s3);
		mp.addSong(s4);

		mp.playSong(1);

		//TESTS
		//mp.testGetLyics(1);
		//System.out.println(mp.createPlaylist("test"));
		//mp.createPlaylistTEST("testPlaylist");
		//System.out.println(mp.checkPlaylistTEST());
		//System.out.println(mp.getPlaylistNameTEST(0));

	/* 	System.out.println(mp.createPlaylist("testPlaylist1"));
		System.out.println(mp.createPlaylist("testPlaylist2"));
		System.out.println(mp.createPlaylist("testPlaylist3"));
		System.out.println(mp.createPlaylist("testPlaylist4"));
		System.out.println(mp.createPlaylist("testPlaylist5"));
		System.out.println(mp.createPlaylist("testPlaylist6"));
		System.out.println(mp.createPlaylist("testPlaylist7")); */

		//System.out.println(mp.checkPlaylistTEST());

 		mp.createPlaylist("Playlist 1");
		mp.createPlaylist("Playlist 2");

		//TESTS
		/* System.out.println(mp.checkPlaylistTEST());
		System.out.println(mp.getPlaylistNameTEST(0));
		System.out.println(mp.getPlaylistNameTEST(1)); */

		mp.addSong(0, 0);
		mp.addSong(2, 1);
		mp.addSong(3, 1);

		mp.playPlaylist(0);
		mp.playPlaylist(1);
	}
}