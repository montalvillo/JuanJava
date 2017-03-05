
import java.applet.Applet;
import java.applet.AudioClip;




public class Auxiliar {
    
    
    static void Sonar (){
        
        AudioClip clip = Applet.newAudioClip(ClassLoader.getSystemResource("Beep.wav"));
        clip.play();
        
           
     
 }   
    
}
