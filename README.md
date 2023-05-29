# Recently Played Store

The Recently Played Store is a Java program that allows you to store and retrieve recently played songs for each user. It provides a fixed initial capacity for storing a list of song-user pairs and automatically eliminates the least recently played songs when the store becomes full.


## Steps to run the code in any IDE

1. Open the project in your preferred Java IDE, such as IntelliJ IDEA.

2. Locate the `RecentlyPlayedStore` class in the project structure.

3. Run the `RecentlyPlayedStore` class by right-clicking on it and selecting "Run" or using the provided run icon.

The program will demonstrate the usage of the Recently Played Store by adding played songs and retrieving the recently played songs for a user.


## Usage

To use the Recently Played Store, follow these steps:

1. Initialize the RecentlyPlayedStore with a desired capacity:
   ```java
   RecentlyPlayedStore store = new RecentlyPlayedStore(3);
2. Add played songs for a user:
   ```java
   store.addPlayedSong("Song1", "User1");
   store.addPlayedSong("Song2", "User1");
   store.addPlayedSong("Song3", "User1");
   
3. Retrieve the recently played songs for a user:
   ```java
   String[] recentSongs = store.getRecentlyPlayedSongs("User1");

## JUnit Tests

The JUnit test class `RecentlyPlayedStoreTest` provides comprehensive test cases to validate the logic of the RecentlyPlayedStore class. It covers various scenarios, including adding played songs, managing capacity, and retrieving recently played songs.

To run the JUnit tests, follow these steps:

1. Ensure that JUnit is properly configured as a dependency in your Maven project.

2. Open the `RecentlyPlayedStoreTest.java` file located in the `src/test/java` directory.

3. Run the tests by right-clicking inside the test class and selecting "Run 'RecentlyPlayedStoreTest'" or using the provided green arrow icon next to the test class or individual test methods.

The test cases will be executed using JUnit, and the results will be displayed in the "Run" tool window.

## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

