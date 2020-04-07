package UI;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.InputStream;

/**
 * Store the details of the background Music
 */
public class Music {
    private long clipPosition;
    private boolean isPause;
    private Clip clip;
    void playSound(){
        try{
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(GameScreen.class.getResourceAsStream("/BackgroundMusic.wav"));
            if (audioInput != null){
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                isPause = false;
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else{
                System.out.println("Error: Can't find file");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * check the music is pause or not
     * @return true if the music is pause
     */
    public boolean isPause(){ return isPause; }

    /**
     * Set to pause the background music of the game
     */
    public void pauseMusic(){
        clipPosition = clip.getMicrosecondPosition();
        clip.stop();
        isPause = true;
    }

    /**
     * play the music when the player unmute the background music
     */
    public void unPause(){
        clip.setMicrosecondPosition(clipPosition);
        clip.start();
        isPause = false;
    }
}
