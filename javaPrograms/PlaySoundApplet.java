import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PlaySoundApplet extends Applet{
   Button play,stop;
   AudioClip audioClip;
   
   public void init() {
      play = new Button(" Play in Loop ");
      audioClip = getAudioClip(getCodeBase(), getParameter("Audio"));
      add(play);
      play.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
           audioClip.play();
        }
      });
      stop = new Button(" Stop ");
      add(stop);
      stop.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            audioClip.stop();
            }
      });
     
    
   }
   
}
/*
<html>
<head>
    <title>Passing Parameter Applet !!!</title>
</head>
<body>  
<applet code="PlaySoundApplet.class" width="300" height="300">  
<param name="Audio" value="Sound.wav">  
</applet>  
</body>  
</html>
*/ 