package SpotifyPlaylist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Spotify");
		Scanner scanner = new Scanner(System.in);
		Playlist playlist = new Playlist();
		
		while (true) {
			System.out.println("Choose an option: ");
			System.out.println("\n 1. Add song to playlist\n 2. Display playlist\n"
					+ " 3. Remove a song from playlist\n 4. Play next song\n 5. Exit");
			
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter artist name: ");
				String artist = scanner.nextLine();
				playlist.addSong(title, artist);
				break;
			case 2:
				playlist.displayPlayList();
				break;
			case 3:
				System.out.print("Enter title of song to remove: ");
				title = scanner.nextLine();
				playlist.removeSong(title);
				break;
			case 4:
				playlist.displayCurrentSong();
				playlist.displayNextSong();
				break;
			case 5:
				System.out.println("Exiting playlist. ");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again. ");
			}
			
		}
	}

}
