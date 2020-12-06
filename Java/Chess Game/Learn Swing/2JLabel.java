package chessgame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelEx {
	public static void main(String[] args) {
		//JLabel : display area for content(text, image)
		
		ImageIcon image = new ImageIcon("cats.png");
		Border border = BorderFactory.createLineBorder(Color.red, 5);
		
		JLabel label = new JLabel();
		label.setText("Hi Yerim!");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0xFFFFFF));
		label.setFont(new Font("arial", Font.PLAIN, 20));
		label.setIconTextGap(-25);
		label.setIconTextGap(100); //set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0,0,250,250);
	
		
		JFrame frame = new JFrame("Chess Game");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.add(label);
		//frame.pack();
	}
}
