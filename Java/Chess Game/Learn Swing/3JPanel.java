import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;

public class ExClass {
	public static void main(String[] args) {
		//JPanel : container to hold other components		
		JLabel label = new JLabel();
		label.setText("Hi");
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250, 250);
		
		JPanel greenpanel = new JPanel();
		redpanel.setBackground(Color.green);
		redpanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		bluepanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
	}
}
