import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame implements ActionListener{
	
	//JButton = a button that performs an action when clicked on
	
	JButton button;
	JLabel label;
	
	Frame1(){
		label = new JLabel();
		label.setText("Hi!");
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		button.setText("Hello");
		button.setFocusable(true);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("arial", Font.BOLD, 25));
		button.setBackground(Color.green);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			//System.out.println("Hello");
			label.setVisible(true);
		}
	}
}
