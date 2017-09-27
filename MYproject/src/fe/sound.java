/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

/**
 *
 * @author Atharva
 */
public class sound {
       sound() throws LineUnavailableException{
            try{
                AudioInputStream ais= AudioSystem.getAudioInputStream(new File("./src/fe/sound_Master.wav").getAbsoluteFile());
                Clip clip=AudioSystem.getClip();
                clip.open(ais);
                clip.start();
            }
            catch(Exception x)
            {
                JOptionPane.showMessageDialog(null, x);
            }
            
            
      
      }
    
}
