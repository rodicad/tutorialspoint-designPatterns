package main.java.tutorialspoint.designs.structural.adapterPattern.mediaPlayer;

/**
 * Created by rodicad on 26/10/2017.
 */
public class VLCPlayer implements AdvancedMediaPlayer{

    @Override public void play( String filename ) {
        System.out.println("Playing vlc filename: "+filename);

    }


}
