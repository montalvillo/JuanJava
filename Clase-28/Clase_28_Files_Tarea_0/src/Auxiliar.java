
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;




public class Auxiliar {
    
    
    static void Sonar (){
        
 AudioClip clip = Applet.newAudioClip(ClassLoader.getSystemResource("Beep.wav"));
 clip.play();
         }
  
    
}


