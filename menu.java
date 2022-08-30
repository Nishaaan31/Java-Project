package Alpha3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class menu implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label1= new JLabel("Alphabet Quiz Game");
	JButton PlayButton = new JButton("Play");
	JButton InstructionButton = new JButton("Instructions");
	JButton ScoreButton = new JButton("Score Board");
	JButton resetButton = new JButton("Reset Score");
	JButton ExitButton = new JButton("Exit");
	
	Font titleFont = new Font("Tahoma", Font.BOLD, 58);
	
	public menu() {
		frame.getContentPane().setBackground(new Color(219, 112, 147));
	
		frame.setTitle("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(700,500);
		
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		label1.setForeground(new Color(255, 240, 245));
		label1.setBounds(45, 5, 594, 81);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label1);
		PlayButton.setForeground(new Color(255, 255, 255));
		PlayButton.setBackground(new Color(204, 153, 255));
		PlayButton.setBounds(250, 145, 165, 57);
		frame.getContentPane().add(PlayButton);
		InstructionButton.setForeground(new Color(255, 255, 255));
		InstructionButton.setBackground(new Color(255, 102, 153));
		InstructionButton.setBounds(153, 213, 385, 57);
		frame.getContentPane().add(InstructionButton);
		ScoreButton.setForeground(new Color(255, 255, 255));
		ScoreButton.setBackground(new Color(204, 102, 153));
		ScoreButton.setBounds(153, 281, 385, 57);
		frame.getContentPane().add(ScoreButton);
		ExitButton.setForeground(new Color(255, 255, 255));
		ExitButton.setBackground(new Color(102, 102, 102));
		ExitButton.setBounds(272, 349, 136, 57);
		frame.getContentPane().add(ExitButton);
		
		
		
		
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 58));
		PlayButton.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		InstructionButton.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		ScoreButton.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		ExitButton.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(105, 105, 105), 3));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 90, 664, 360);
		frame.getContentPane().add(panel);
		
		PlayButton.addActionListener(this);
		InstructionButton.addActionListener(this);
		ScoreButton.addActionListener(this);
		ExitButton.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==PlayButton) {
			new AlphabetGameForKids();
			frame.dispose();
		}
		if(e.getSource()==InstructionButton) {
			new instruction();
			frame.dispose();
		}
		if(e.getSource()==ExitButton) {
		    System.exit(0);
		}
		if(e.getSource()==ScoreButton) {
			new ScoreBoard();
			frame.dispose();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		menu menu = new menu();
	}
}
