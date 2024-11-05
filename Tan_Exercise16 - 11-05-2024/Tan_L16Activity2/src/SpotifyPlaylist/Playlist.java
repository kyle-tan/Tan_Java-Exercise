package SpotifyPlaylist;

import java.util.LinkedList;

public class Playlist {
	private LinkedList<Song> playlist;
	private int currentSongIndex;
	
	public Playlist() {
		playlist = new LinkedList<Song>();
		currentSongIndex = -1;
	}
	
	public void addSong(String title, String artist) {
		playlist.add(new Song(title,artist));
		System.out.println("Song added to the playlist!");
	}
	
	public void displayPlayList() {
		System.out.println("Playlist: ");
		for(int x=0; x < playlist.size(); x++) {
			System.out.printf("%d. '%s' by %s \n",(x+1), playlist.get(x).getTitle(), playlist.get(x).getArtist());
		}
	}
	
	public void removeSong(String title) {
		for(int x = 0; x < playlist.size(); x++) {
			if(playlist.get(x).getTitle().equalsIgnoreCase(title)) {
				playlist.remove(x);
			}
		}
		System.out.println("Song removed from playlist");
	}
	
	public void displayCurrentSong() {
		System.out.printf("Current Song: '%s' by %s\n", playlist.get(++currentSongIndex).getTitle(), playlist.get(currentSongIndex).getArtist());
		
	}
	
	public void displayNextSong() {
		if(currentSongIndex+1 == playlist.size()) {
			currentSongIndex = -1;
		}
		System.out.printf("Next Song: '%s' by %s\n", playlist.get(currentSongIndex+1).getTitle(), playlist.get(currentSongIndex+1).getArtist());
	}
}
