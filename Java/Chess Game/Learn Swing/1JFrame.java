package chessgame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	MainFrame(){
		JFrame frame = new JFrame();
		this.setSize(600, 600);
		this.setTitle("My Frame");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//HIDE_ON_CLOSE
		//EXIT_ON_CLOSE
		//DO_NOTHING_ON_CLOSE
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0,0,0));
		//RGB as an argument
		//hexadecimal value as an argument 0x000000 black, 0xFFFFFF white
	}
}
