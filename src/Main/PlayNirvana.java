package Main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayNirvana {
	  public void playNirvana() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		   File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\EmployeeData\\src\\Nirvana.wav");
		   AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		   
		   Clip clip = AudioSystem.getClip();
		   
		   clip.open(audioStream);
		   clip.start();
		   
		   Scanner scanner = new Scanner(System.in);
		   String stream = scanner.nextLine();
		   scanner.close();
	   }
}
