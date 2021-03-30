import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * The retro auto clicker is a simple auto clicker with the ability to 
 * costomize the exact second and/or milisecond inbetween each click.
 * 
 */

public class retro extends clickerScreen{
	
	//Declaring globally for event/action listners 
	JFrame retroFrame = new JFrame();
	
	retro()
	{
			
			
			retroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Only disposes of the retroFrame window
			retroFrame.setLayout(null);
			retroFrame.setSize(500,250);
			retroFrame.setVisible(true);
			retroFrame.setLocationRelativeTo(null);
			retroFrame.setTitle("Retro AutoClicker");
			retroFrame.getContentPane().setBackground(Color.GREEN);
			
			//This code changes the window icon to a green partyhat
			ImageIcon image = new ImageIcon("greenPartyhat.png");
	        retroFrame.setIconImage(image.getImage());
	}
}
