import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Random;
>>>>>>> RandomPlaylist

/**
 * A class to hold details of audio tracks.
 * Individual tracks may be played.
 * 
<<<<<<< HEAD
 * @author Giovanny Ospina
 * @version 10.15.2017
=======
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
>>>>>>> RandomPlaylist
 */
public class MusicOrganizer
{
    // An ArrayList for storing music tracks.
    private ArrayList<Track> tracks;
    // A player for the music tracks.
    private MusicPlayer player;
    // A reader that can read music files and load them as tracks.
    private TrackReader reader;
<<<<<<< HEAD
=======
    // Initializes the Random feature
    private Random randomtrack;
>>>>>>> RandomPlaylist

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        tracks = new ArrayList<>();
        player = new MusicPlayer();
        reader = new TrackReader();
<<<<<<< HEAD
=======
        randomtrack = new Random();
>>>>>>> RandomPlaylist
        readLibrary("../audio");
        System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
        System.out.println();
    }
    
    /**
     * Add a track file to the collection.
     * @param filename The file name of the track to be added.
     */
    public void addFile(String filename)
    {
        tracks.add(new Track(filename));
    }
    
    /**
     * Add a track to the collection.
     * @param track The track to be added.
     */
    public void addTrack(Track track)
    {
        tracks.add(track);
    }
    
    /**
     * Play a track in the collection.
     * @param index The index of the track to be played.
     */
    public void playTrack(int index)
    {
<<<<<<< HEAD
        if(indexValid(index)) {
=======
        if(indexValid(index)) 
        {
>>>>>>> RandomPlaylist
            Track track = tracks.get(index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
        }
    }
    
    /**
     * Return the number of tracks in the collection.
     * @return The number of tracks in the collection.
     */
    public int getNumberOfTracks()
    {
        return tracks.size();
    }
    
<<<<<<< HEAD
=======
     /**
     * 4.43 - Gets a random track and plays it.
     * @param index The index of the track that is randomized
     */
    public void randomTrack(int index)
    {
        int trackNumber = getNumberOfTracks();
        int rindex = randomtrack.nextInt(trackNumber);
        if(indexValid(index)) 
        {
            Track track = tracks.get(rindex);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
        }
    }
    
    /**
     * 4.45 - Gets a random track from the list and plays each exactly once.
     */
    public void playAllRandom()
    {
        int rindex;
        int[] PlayList = new int[tracks.size()];
        
        for (int i = 0; i < tracks.size(); i++)
        {
            PlayList[i] = i;
        }
        
        for (int i = tracks.size()-1; i > 0; i--)
        {
            rindex = randomtrack.nextInt(i + 1);
            int r = PlayList[rindex];
            PlayList[rindex] = PlayList[i];
            PlayList[i] = r;
        }

        for (int i = 0; i < tracks.size(); i++)
        {
            System.out.println(PlayList[i]);
            int track = PlayList[i];
            playTrack(track);
        }
    }
        
>>>>>>> RandomPlaylist
    /**
     * List a track from the collection.
     * @param index The index of the track to be listed.
     */
    public void listTrack(int index)
    {
        System.out.print("Track " + index + ": ");
        Track track = tracks.get(index);
        System.out.println(track.getDetails());
    }
    
    /**
     * Show a list of all the tracks in the collection.
     */
    public void listAllTracks()
    {
        System.out.println("Track listing: ");

        for(Track track : tracks) {
            System.out.println(track.getDetails());
        }
        System.out.println();
    }
    
    /**
     * List all tracks by the given artist.
     * @param artist The artist's name.
     */
    public void listByArtist(String artist)
    {
        for(Track track : tracks) {
            if(track.getArtist().contains(artist)) {
                System.out.println(track.getDetails());
            }
        }
    }
    
    /**
     * Remove a track from the collection.
     * @param index The index of the track to be removed.
     */
    public void removeTrack(int index)
    {
<<<<<<< HEAD
        if(indexValid(index)) {
=======
        if(indexValid(index)) 
        {
>>>>>>> RandomPlaylist
            tracks.remove(index);
        }
    }
    
    /**
     * Play the first track in the collection, if there is one.
     */
    public void playFirst()
    {
<<<<<<< HEAD
        if(tracks.size() > 0) {
=======
        if(tracks.size() > 0) 
        {
>>>>>>> RandomPlaylist
            player.startPlaying(tracks.get(0).getFilename());
        }
    }
    
    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean indexValid(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= tracks.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    
    private void readLibrary(String folderName)
    {
        ArrayList<Track> tempTracks = reader.readTracks(folderName, ".mp3");

        // Put all thetracks into the organizer.
<<<<<<< HEAD
        for(Track track : tempTracks) {
=======
        for(Track track : tempTracks) 
        {
>>>>>>> RandomPlaylist
            addTrack(track);
        }
    }
}
