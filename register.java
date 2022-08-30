package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;

public class register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	public register() {
		setSize(500,500);
		setVisible(true);
		setResizable(true);
		getContentPane().setLayout(null);
		
		
		
		JButton OK = new JButton("OK");
		OK.setBackground(new Color(204, 51, 153));
		OK.setForeground(new Color(255, 255, 255));
		OK.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setName(textField.getText());
				int a=Integer.parseInt(textField_1.getText());
				User.setAge(a);
				
				new menu();
				dispose();
			}
		});
		
		JButton CloseButton = new JButton("Close");
		CloseButton.setBackground(new Color(102, 102, 102));
		CloseButton.setForeground(new Color(255, 255, 255));
		CloseButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel regisname = new JLabel("Name:");
		regisname.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		regisname.setBounds(38, 134, 123, 35);
		getContentPane().add(regisname);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblAge.setBounds(38, 208, 123, 43);
		getContentPane().add(lblAge);
		CloseButton.setBounds(283, 295, 114, 35);
		getContentPane().add(CloseButton);
		OK.setBounds(109, 295, 114, 35);
		getContentPane().add(OK);
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 216, 178, 35);
		getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(171, 140, 178, 35);
		getContentPane().add(textField);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 460);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src/bg1.png"));
		lblNewLabel.setBounds(0, 0, 484, 460);
		panel.add(lblNewLabel);
		
		
	}
}
