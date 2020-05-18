package collections.list.linkedist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Program {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Album1", "artist1");
        album.addSong("Song1", 4.6);
        album.addSong("Song2", 5.0);
        albums.add(album);
        album = new Album("Album2", "artist2");
        album.addSong("Song3", 4.6);
        album.addSong("Song4", 5.0);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Song1", playList);
        albums.get(0).addToPlayList("Song2", playList);
        albums.get(1).addToPlayList("Song3", playList);
        albums.get(1).addToPlayList("Song4", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }
}
