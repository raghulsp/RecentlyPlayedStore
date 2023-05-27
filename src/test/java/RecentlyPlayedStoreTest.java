import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecentlyPlayedStoreTest {
    private RecentlyPlayedStore store;

    @BeforeEach
    public void setup() {
        store = new RecentlyPlayedStore(3);
    }

    @Test
    public void testAddPlayedSongAndGetRecentlyPlayedSongs() {
        store.addPlayedSong("S1", "John");
        store.addPlayedSong("S2", "John");
        store.addPlayedSong("S3", "John");

        String[] recentSongs = store.getRecentlyPlayedSongs("John");

        Assertions.assertArrayEquals(new String[]{"S1", "S2", "S3"}, recentSongs);
    }

    @Test
    public void testAddPlayedSongWithCapacityReached() {
        store.addPlayedSong("S1", "John");
        store.addPlayedSong("S2", "John");
        store.addPlayedSong("S3", "John");

        store.addPlayedSong("S4", "John");

        String[] recentSongs = store.getRecentlyPlayedSongs("John");

        Assertions.assertArrayEquals(new String[]{"S2", "S3", "S4"}, recentSongs);
    }
}
