package Alpha3;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Color;

public class instruction extends JFrame implements ActionListener{
	JLabel instruc1 = new JLabel("Welcome to Alphabet Quiz Game");
	JLabel instruc2 = new JLabel("1.There will be 10 questions");
	JLabel instruc3 = new JLabel("2.Each question will give 1 mark will be added to \r\n");
	JLabel instruc4 = new JLabel("3.If you make mistake it will be added to ");
	Container c;
	JButton Back = new JButton("Return");
	
	Font allFont = new Font("Tahoma",Font.BOLD, 38);
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblRightCounter = new JLabel("the right counter\r\n");
	private final JLabel lblTheLeftCounter = new JLabel("the left counter");
	
	public instruction() {
		getContentPane().setBackground(new Color(250, 128, 114));
		c = getContentPane();
		c.setLayout(null);
		
		instruc2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		instruc2.setBounds(23, 170, 508, 29);
		c.add(instruc2);
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 111, 667, 384);
		
		getContentPane().add(panel);
		panel.setLayout(null);
		instruc4.setBounds(14, 161, 603, 45);
		panel.add(instruc4);
		
		instruc4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblRightCounter.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblRightCounter.setBounds(41, 133, 693, 32);
		
		panel.add(lblRightCounter);
		lblTheLeftCounter.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblTheLeftCounter.setBounds(39, 199, 693, 32);
		
		panel.add(lblTheLeftCounter);
		instruc3.setBounds(13, 96, 693, 32);
		panel.add(instruc3);
		
		instruc3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		JLabel lblremarksWillBe = new JLabel("4.Remarks will be given below for right and wrong answer");
		lblremarksWillBe.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblremarksWillBe.setBounds(14, 227, 736, 45);
		panel.add(lblremarksWillBe);
		
		JLabel lblAnswer = new JLabel("  answer");
		lblAnswer.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblAnswer.setBounds(19, 258, 182, 45);
		panel.add(lblAnswer);
		Back.setForeground(Color.WHITE);
		Back.setBackground(Color.GRAY);
		Back.setBounds(538, 344, 120, 32);
		panel.add(Back);
		
		Back.addActionListener(this);
		
				Back.setFont(new Font("Tahoma", Font.BOLD, 23));
				Back.addActionListener(this);
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(10, 11, 667, 89);
		
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		instruc1.setForeground(new Color(160, 82, 45));
		instruc1.setBounds(23, 21, 623, 46);
		panel_1.add(instruc1);
		
		instruc1.setFont(new Font("Comic Sans MS", Font.BOLD, 38));
		
		
		setTitle("Alphabet Game For Kids"); //title of the game in window bar
		setSize(703,546); //window size
		setLocation(900,100); //sets location on the screen
		setResizable(true); //now max or minimum sizable 
		setVisible(true); //will be shown on screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Back) {
			new menu();
			dispose();
		}
		
	}
	public static void main(String[] args) {
		instruction instruc = new instruction();
		
	}
}