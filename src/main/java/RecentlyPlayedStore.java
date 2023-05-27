import java.util.*;

public class RecentlyPlayedStore {
    private int capacity;
    private LinkedHashMap<String, String> songUserMap;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.songUserMap = new LinkedHashMap<>(capacity, 0.75f, true) {

            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > capacity;
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial capacity: ");
        int initialCapacity = scanner.nextInt();
        scanner.nextLine();

        RecentlyPlayedStore store = new RecentlyPlayedStore(initialCapacity);

        System.out.print("Enter the number of songs to play initially: ");
        int songsToPlay = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < songsToPlay; i++) {
            System.out.print("Enter the name of song " + (i + 1) + ": ");
            String song = scanner.nextLine();

            System.out.print("Enter the name of user: ");
            String user = scanner.nextLine();

            store.addPlayedSong(song, user);
        }

        System.out.println("\nRecently played songs after initial playing:");
        System.out.print("Enter the name of user: ");
        String userName = scanner.nextLine();
        String[] recentSongs = store.getRecentlyPlayedSongs(userName);
        System.out.println(Arrays.toString(recentSongs));

        System.out.print("\nEnter the number of additional songs to play: ");
        int additionalSongs = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < additionalSongs; i++) {
            System.out.print("Enter the name of the next song: ");
            String song = scanner.nextLine();

            System.out.print("Enter the name of user: ");
            String user = scanner.nextLine();

            store.addPlayedSong(song, user);
        }

        System.out.println("\nRecently played songs after additional plays:");
        System.out.print("Enter the name of user: ");
        userName = scanner.nextLine();
        recentSongs = store.getRecentlyPlayedSongs(userName);
        System.out.println(Arrays.toString(recentSongs));

        scanner.close();
    }

    public void addPlayedSong(String song, String user) {
        songUserMap.put(song, user);
    }

    public String[] getRecentlyPlayedSongs(String user) {
        List<String> recentSongsList = new ArrayList<>();
        for (Map.Entry<String, String> entry : songUserMap.entrySet()) {
            if (entry.getValue().equals(user)) {
                recentSongsList.add(entry.getKey());
            }
        }
        return recentSongsList.toArray(new String[0]);
    }
}
