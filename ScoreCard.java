package Alpha3;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class ScoreCard extends JFrame {
	
	
	
	ScoreCard(int righCount){
		getContentPane().setBackground(new Color(255, 182, 193));
		
	
		
	setSize(529,507); //window size
	setLocation(900,100); //sets location on the screen
	setResizable(false); //now max or minimum sizable 
	setVisible(true); //will be shown on screen
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("Main Manu");
	btnNewButton.setForeground(new Color(240, 248, 255));
	btnNewButton.setBackground(new Color(204, 102, 102));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			 File f = new File("Score.dat");

             try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))){
                 dos.writeUTF(User.getName());
                 dos.writeInt(User.getAge());
                 dos.writeInt(righCount);
             }
             catch(Exception ex) {
                 JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
             }
			
			new menu();
			dispose();
			
		}
	});
	btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
	btnNewButton.setBounds(172, 355, 171, 46);
	getContentPane().add(btnNewButton);
	
	JButton btnExit = new JButton("EXIT");
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			 
		}
	});
	btnExit.setBackground(new Color(105, 105, 105));
	btnExit.setForeground(new Color(255, 255, 255));
	btnExit.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
	btnExit.setBounds(198, 409, 131, 46);
	getContentPane().add(btnExit);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(255, 240, 245));
	panel.setBounds(10, 121, 493, 208);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel namelabel = new JLabel("Name:");
	namelabel.setBounds(10, 11, 131, 58);
	panel.add(namelabel);
	namelabel.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
	
	JLabel lblAge = new JLabel("Age:");
	lblAge.setBounds(10, 68, 131, 58);
	panel.add(lblAge);
	lblAge.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
	
	JLabel lblPoint = new JLabel("Point:");
	lblPoint.setBounds(10, 137, 131, 58);
	panel.add(lblPoint);
	lblPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
	
	JLabel lblNewLabel_1 = new JLabel(Integer.toString(User.getAge()));
	lblNewLabel_1.setBounds(257, 83, 69, 35);
	panel.add(lblNewLabel_1);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
	
	JLabel lblNewLabel_2 = new JLabel(Integer.toString(righCount));
	lblNewLabel_2.setBounds(257, 153, 72, 35);
	panel.add(lblNewLabel_2);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
	
	JLabel lblNewLabel = new JLabel(User.getName());
	lblNewLabel.setBounds(257, 24, 188, 46);
	panel.add(lblNewLabel);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
	
	JPanel panel_1 = new JPanel();
	panel_1.setForeground(new Color(255, 250, 250));
	panel_1.setBackground(new Color(219, 112, 147));
	panel_1.setBounds(10, 11, 493, 99);
	getContentPane().add(panel_1);
	panel_1.setLayout(null);
	
	JLabel scorewelcometext = new JLabel("Score Board");
	scorewelcometext.setForeground(new Color(240, 248, 255));
	scorewelcometext.setBounds(104, 11, 288, 77);
	panel_1.add(scorewelcometext);
	scorewelcometext.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
	}
}

