import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * Anti-Cheat auto clicker has randomdized AI functions that
 * help mimic the movements of a human to stay hidden from 
 * jagex anti-cheat.
 * 
 */
public class antiCheat extends clickerScreen {
	
	JFrame anticheat = new JFrame();
	
	antiCheat()
	{
		anticheat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Only disposes of the anticheat window
		anticheat.setLayout(null);
		anticheat.setSize(500,250);
		anticheat.setVisible(true);
		anticheat.setLocationRelativeTo(null);
		anticheat.setTitle("Anti-Cheat AutoClicker");
		anticheat.getContentPane().setBackground(Color.red);
		
		ImageIcon image = new ImageIcon("redPartyhat.png");
        anticheat.setIconImage(image.getImage());
	}
}
