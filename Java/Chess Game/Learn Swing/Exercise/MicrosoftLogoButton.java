import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame implements ActionListener{
	JButton colorButton;
	JPanel leftUp;
	JPanel leftDown;
	JPanel rightUp;
	JPanel rightDown;
	
	Frame1(){
		leftUp = new JPanel();
		leftUp.setBackground(Color.red);
		leftUp.setBounds(0, 0, 250, 250);
		
		leftDown = new JPanel();
		leftDown.setBackground(Color.blue);
		leftDown.setBounds(0, 250, 250, 500);
		
		rightUp = new JPanel();
		rightUp.setBackground(Color.green);
		rightUp.setBounds(250, 0, 500, 250);
		
		rightDown = new JPanel();
		rightDown.setBackground(Color.yellow);
		rightDown.setBounds(250, 250, 500, 500);
		
		colorButton = new JButton();
		colorButton.setBounds(250-100, 250-100, 250-50, 250-50);
		colorButton.addActionListener(this);
		colorButton.setText("Change Color");
		
		
		JFrame mainframe = new JFrame();
		this.setSize(500, 500);
		this.setTitle("Color Mixer");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(colorButton);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == colorButton) {
			this.add(leftUp);
			this.add(leftDown);
			this.add(rightUp);
			this.add(rightDown);
		}
	}
}
