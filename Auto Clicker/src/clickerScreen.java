import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Welcome to the Runescape Auto Clicker!
 * 
 * There are many settings I have been playing with to keep from being 
 * detected from the botting system.
 * 
 * Feel free to play with the settings and use it how you please!
 * 
 * www.github.com/calixt88
 * 
 */
public class clickerScreen implements ActionListener{
	
	JButton closeButton = new JButton("Close");
	JButton githubButton = new JButton("Help");
	Desktop desktop = Desktop.getDesktop();
	JFrame frame = new JFrame();

	public clickerScreen()
	{
		
		//declaration of frame and panel objects
		JPanel panel = new JPanel();
		JPanel wisePanel = new JPanel();
		JPanel optionPanel = new JPanel();
		JPanel logoPanel = new JPanel();
		JLabel logoLabel = new JLabel();
		JLabel WISEOLDMAN = new JLabel();
		JLabel directions = new JLabel();
		ImageIcon wiseOldMan = new ImageIcon("wiseOldMan.png");
		ImageIcon rsLogo = new ImageIcon("rs.png");
		
		
		closeButton = new JButton("Close");
		JButton retroButton = new JButton("Retro");
		
		frame.add(retroButton);
		retroButton.setBounds(150, 115, 120, 45);
		retroButton.setBackground(Color.white);
		retroButton.setFont(new Font("Zapfino", Font.PLAIN, 15));
		retroButton.setFocusable(false);
		retroButton.addActionListener(e -> retro());
		
		
		frame.add(githubButton);
		githubButton.setBounds(150, 170, 120, 45);
		githubButton.setBackground(Color.white);
		githubButton.setFont(new Font("Zapfino", Font.PLAIN, 15));
		githubButton.setFocusable(false);
		githubButton.addActionListener(this);
	
		
		
		JButton antiButton = new JButton("Anti-Cheat");
		frame.add(antiButton);
		antiButton.setBounds(300, 115, 120, 45);
		antiButton.setBackground(Color.white);
		antiButton.setFont(new Font("Zapfino", Font.PLAIN, 15));
		antiButton.setFocusable(false);
		antiButton.addActionListener(e -> antiCheat());
	
		
		//Setting Wise old Man img to its own label.
		WISEOLDMAN.setIcon(wiseOldMan);
		wisePanel.setBounds(-10, -10, 140, 250);
		wisePanel.add(WISEOLDMAN);
		
		directions.setText("Welcome to the Runescape AutoClicker.");
		directions.setBounds(140, 50, 300, 50);
		directions.setFont(new Font("Zapfino", Font.BOLD, 15));
		directions.setForeground(Color.BLACK);
		
		logoPanel.add(logoLabel);
		logoLabel.setIcon(rsLogo);
		logoPanel.setBounds(133, 0, 300, 75);
		logoPanel.setBackground(Color.BLUE);
		
 		optionPanel.setBounds(130, 0, 400, 240);
 		optionPanel.setBackground(Color.BLUE);
 		
 		
 		frame.add(closeButton);
 		closeButton.setBounds(300, 170, 120, 45);
 		closeButton.setBackground(Color.white);
 		closeButton.setFont(new Font("Zapfino", Font.PLAIN, 15));
 		closeButton.setFocusable(false);
 		closeButton.addActionListener(e -> System.exit(0));
			
		// This code changes the icon of the window to a blue partyhat
		ImageIcon image = new ImageIcon("bluePartyhat.png");
        frame.setIconImage(image.getImage());
        
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 150, 240));
		frame.setLayout(null); //new GridLayout(0,1)
		frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RuneScape AutoClicker");
        frame.pack();
        frame.setSize(450, 269);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(directions);
        frame.add(logoPanel);
        frame.add(wisePanel);
        frame.add(optionPanel);
       
        
        
	}
	
	private Object retro() {
		new retro();
		frame.setVisible(false);
		return null;
	}
	
	private Object antiCheat()
	{
		new antiCheat();
		frame.setVisible(false);
		return null;
	}

	public static void main(String[] args) {
		new clickerScreen();
		
	}
		
	/*
	@SuppressWarnings("deprecation")
	public static void click()
	{
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}
	*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == githubButton)
		{
		try {
			URI uri = new URI("https://github.com/calixt88/Runescape-AutoClicker");
			desktop.browse(uri);
		} catch (URISyntaxException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
}
