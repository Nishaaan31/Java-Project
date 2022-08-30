package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class AlphabetGameForKids extends JFrame implements ActionListener {

        
		JLabel titleLabel = new JLabel("Alphabet Quiz");
		JLabel questionLabel = new JLabel();
		JLabel answerLabel = new JLabel("Answer: ");   
		
		JButton exitButton = new JButton ("RETURN");
		JButton AButton = new JButton ("A");
		JButton BButton = new JButton ("B");
		JButton CButton = new JButton ("C");
		JButton DButton = new JButton ("D");
		JButton EButton = new JButton ("E");
		JButton FButton = new JButton ("F");
		JButton GButton = new JButton ("G");
		JButton HButton = new JButton ("H");
		JButton IButton = new JButton ("I");
		JButton JButton = new JButton ("J");
		JButton KButton = new JButton ("K");
		JButton LButton = new JButton ("L");
		JButton MButton = new JButton ("M");
		JButton NButton = new JButton ("N");
		JButton OButton = new JButton ("O");
		JButton PButton = new JButton ("P");
		JButton QButton = new JButton ("Q");
		JButton RButton = new JButton ("R");
		JButton SButton = new JButton ("S");
		JButton TButton = new JButton ("T");
		JButton UButton = new JButton ("U");
		JButton VButton = new JButton ("V");
		JButton WButton = new JButton ("W");
		JButton XButton = new JButton ("X");
		JButton YButton = new JButton ("Y");
		JButton ZButton = new JButton ("Z");
		
		JTextField answerField = new JTextField(10);
		JTextField remarksField = new JTextField(15);
		JTextField rightCounterField = new JTextField(3);
		JTextField wrongCounterField = new JTextField(3);
		public int righCount=0, wrongCount = 0, queCount = 0;
		
		Font titleFont = new Font("Tahoma",Font.BOLD, 30);
		Font questionFont = new Font("Tahoma",Font.BOLD, 48);
		Font answerFont = new Font("Tahoma",Font.BOLD, 38);
		private JTextField textField = new JTextField();
		
		public AlphabetGameForKids() {
			textField.setBounds(48, 96, 396, 61);
			textField.setForeground(new Color(139, 0, 139));
			textField.setEditable(false);
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
			textField.setColumns(10);
			
			textField.setText(Question.getQue(queCount));
			getContentPane().setLayout(null);
			titleLabel.setForeground(new Color(199, 21, 133));
			titleLabel.setBounds(88, 27, 329, 60);
			getContentPane().add(titleLabel);
			questionLabel.setBounds(43, 126, 0, 0);
			getContentPane().add(questionLabel);
			
			getContentPane().add(textField);
			answerLabel.setForeground(new Color(255, 20, 147));
			answerLabel.setBounds(169, 168, 161, 46);
			getContentPane().add(answerLabel);
			answerField.setEditable(false);
			answerField.setBounds(62, 219, 366, 52);
			getContentPane().add(answerField);
			wrongCounterField.setForeground(new Color(255, 255, 255));
			wrongCounterField.setBounds(126, 288, 114, 52);
			wrongCounterField.setBackground(new Color(255, 99, 71));
			wrongCounterField.setEditable(false);
			getContentPane().add(wrongCounterField);
			rightCounterField.setForeground(new Color(255, 255, 255));
			rightCounterField.setBounds(245, 288, 114, 52);
			rightCounterField.setBackground(new Color(102, 205, 170));
			rightCounterField.setEditable(false);
			getContentPane().add(rightCounterField);
			rightCounterField.setFont(answerFont);
			remarksField.setBackground(new Color(240, 248, 255));
			remarksField.setBounds(-24, 346, 546, 52);
			remarksField.setEditable(false);
			getContentPane().add(remarksField);
			AButton.setForeground(new Color(255, 255, 255));
			AButton.setBackground(new Color(199, 21, 133));
			AButton.setBounds(26, 409, 53, 45);
			getContentPane().add(AButton);
			BButton.setForeground(new Color(255, 255, 255));
			BButton.setBackground(new Color(199, 21, 133));
			BButton.setBounds(84, 409, 53, 45);
			getContentPane().add(BButton);
			CButton.setForeground(new Color(255, 255, 255));
			CButton.setBackground(new Color(199, 21, 133));
			CButton.setBounds(142, 409, 53, 45);
			getContentPane().add(CButton);
			DButton.setForeground(new Color(255, 255, 255));
			DButton.setBackground(new Color(199, 21, 133));
			DButton.setBounds(200, 409, 55, 45);
			getContentPane().add(DButton);
			IButton.setForeground(new Color(255, 255, 255));
			IButton.setBackground(new Color(199, 21, 133));
			IButton.setBounds(21, 459, 47, 45);
			getContentPane().add(IButton);
			JButton.setForeground(new Color(255, 255, 255));
			JButton.setBackground(new Color(199, 21, 133));
			JButton.setBounds(73, 459, 47, 45);
			getContentPane().add(JButton);
			KButton.setForeground(new Color(255, 255, 255));
			KButton.setBackground(new Color(199, 21, 133));
			KButton.setBounds(125, 459, 53, 45);
			getContentPane().add(KButton);
			LButton.setForeground(new Color(255, 255, 255));
			LButton.setBackground(new Color(199, 21, 133));
			LButton.setBounds(183, 459, 49, 45);
			getContentPane().add(LButton);
			MButton.setForeground(new Color(255, 255, 255));
			MButton.setBackground(new Color(199, 21, 133));
			MButton.setBounds(237, 459, 59, 45);
			getContentPane().add(MButton);
			NButton.setForeground(new Color(255, 255, 255));
			NButton.setBackground(new Color(199, 21, 133));
			NButton.setBounds(301, 459, 55, 45);
			getContentPane().add(NButton);
			OButton.setForeground(new Color(255, 255, 255));
			OButton.setBackground(new Color(199, 21, 133));
			OButton.setBounds(361, 459, 55, 45);
			getContentPane().add(OButton);
			PButton.setForeground(new Color(255, 255, 255));
			PButton.setBackground(new Color(199, 21, 133));
			PButton.setBounds(421, 459, 53, 45);
			getContentPane().add(PButton);
			QButton.setForeground(new Color(255, 255, 255));
			QButton.setBackground(new Color(199, 21, 133));
			QButton.setBounds(15, 509, 55, 45);
			getContentPane().add(QButton);
			SButton.setForeground(new Color(255, 255, 255));
			SButton.setBackground(new Color(199, 21, 133));
			SButton.setBounds(132, 509, 51, 45);
			getContentPane().add(SButton);
			TButton.setForeground(new Color(255, 255, 255));
			TButton.setBackground(new Color(199, 21, 133));
			TButton.setBounds(188, 509, 51, 45);
			getContentPane().add(TButton);
			UButton.setForeground(new Color(255, 255, 255));
			UButton.setBackground(new Color(199, 21, 133));
			UButton.setBounds(244, 509, 55, 45);
			getContentPane().add(UButton);
			exitButton.setForeground(new Color(211, 211, 211));
			exitButton.setBounds(381, 623, 114, 36);
			exitButton.setBackground(new Color(0, 0, 0));
			getContentPane().add(exitButton);
			titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
			questionLabel.setFont(questionFont);
			answerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
			answerField.setFont(answerFont);
			remarksField.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
			wrongCounterField.setFont(answerFont);
			exitButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			exitButton.addActionListener(this);
			AButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			AButton.addActionListener(this); // to pass A as action
			
			BButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			BButton.addActionListener(this); // to pass B as action
			CButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			CButton.addActionListener(this); // to pass C as action
			DButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			DButton.addActionListener(this); // to pass D as action
			IButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			IButton.addActionListener(this); // to pass I as action
			JButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			JButton.addActionListener(this); // to pass J as action
			KButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			KButton.addActionListener(this); // to pass K as action
			LButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			LButton.addActionListener(this); // to pass L as action
			MButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			MButton.addActionListener(this); // to pass M as action
			NButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			NButton.addActionListener(this); // to pass N as action
			OButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			OButton.addActionListener(this); // to pass O as action
			PButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			PButton.addActionListener(this); // to pass P as action
			QButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			QButton.addActionListener(this); // to pass Q as action
			SButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			SButton.addActionListener(this); // to pass S as action
			TButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			TButton.addActionListener(this); // to pass T as action
			UButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			UButton.addActionListener(this); // to pass U as action
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(255, 20, 147), 2));
			panel.setBackground(new Color(255, 192, 203));
			panel.setBounds(5, 406, 488, 202);
			getContentPane().add(panel);
			panel.setLayout(null);
			EButton.setForeground(new Color(255, 255, 255));
			EButton.setBackground(new Color(199, 21, 133));
			EButton.setBounds(252, 5, 51, 45);
			panel.add(EButton);
			EButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			FButton.setForeground(new Color(255, 255, 255));
			FButton.setBackground(new Color(199, 21, 133));
			FButton.setBounds(306, 4, 49, 45);
			panel.add(FButton);
			FButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			HButton.setForeground(new Color(255, 255, 255));
			HButton.setBackground(new Color(199, 21, 133));
			HButton.setBounds(416, 6, 55, 45);
			panel.add(HButton);
			HButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			GButton.setForeground(new Color(255, 255, 255));
			GButton.setBackground(new Color(199, 21, 133));
			GButton.setBounds(359, 6, 55, 45);
			panel.add(GButton);
			GButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			VButton.setForeground(new Color(255, 255, 255));
			VButton.setBackground(new Color(199, 21, 133));
			VButton.setBounds(299, 103, 53, 45);
			panel.add(VButton);
			VButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			XButton.setForeground(new Color(255, 255, 255));
			XButton.setBackground(new Color(199, 21, 133));
			XButton.setBounds(421, 102, 53, 45);
			panel.add(XButton);
			XButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			WButton.setBounds(355, 102, 63, 45);
			panel.add(WButton);
			WButton.setForeground(new Color(255, 255, 255));
			WButton.setBackground(new Color(199, 21, 133));
			WButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			RButton.setBounds(70, 103, 55, 45);
			panel.add(RButton);
			RButton.setForeground(new Color(255, 255, 255));
			RButton.setBackground(new Color(199, 21, 133));
			RButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			ZButton.setBounds(247, 152, 51, 45);
			panel.add(ZButton);
			ZButton.setForeground(new Color(255, 255, 255));
			ZButton.setBackground(new Color(199, 21, 133));
			ZButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			YButton.setBounds(191, 151, 53, 45);
			panel.add(YButton);
			YButton.setForeground(new Color(255, 255, 255));
			YButton.setBackground(new Color(199, 21, 133));
			YButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
			YButton.addActionListener(this); // to pass Y as action
			ZButton.addActionListener(this); // to pass Z as action
			RButton.addActionListener(this); // to pass R as action
			WButton.addActionListener(this); // to pass W as action
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Arnob Haque\\eclipse-workspace\\AlphabetGameForKids\\src\\bg2.png"));
			lblNewLabel.setBounds(3, 1, 495, 661);
			getContentPane().add(lblNewLabel);
			XButton.addActionListener(this); // to pass X as action
			VButton.addActionListener(this); // to pass V as action
			GButton.addActionListener(this); // to pass G as action
			HButton.addActionListener(this); // to pass H as action
			FButton.addActionListener(this); // to pass F as action
			EButton.addActionListener(this); // to pass E as action
			
			
			setTitle("Alphabet Game For Kids"); //title of the game in window bar
			setSize(514,701); //window size
			setLocation(900,100); //sets location on the screen
			setResizable(false); //now max or minimum sizable 
			setVisible(true); //will be shown on screen
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing the window method
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==AButton) {
			  answerField.setText("A");
		  }
		  if(e.getSource()==BButton) {
			  answerField.setText("B");
		  }
		  if(e.getSource()==CButton) {
			  answerField.setText("C");
		  }
		  if(e.getSource()==DButton) {
			  answerField.setText("D");
		  }
		  if(e.getSource()==EButton) {
			  answerField.setText("E");
		  }
		  if(e.getSource()==FButton) {
			  answerField.setText("F");
		  }
		  if(e.getSource()==GButton) {
			  answerField.setText("G");
		  }
		  if(e.getSource()==HButton) {
			  answerField.setText("H");
		  }
		  if(e.getSource()==IButton) {
			  answerField.setText("I");
		  }
		  if(e.getSource()==JButton) {
			  answerField.setText("J");
		  }
		  if(e.getSource()==KButton) {
			  answerField.setText("K");
		  }
		  if(e.getSource()==LButton) {
			  answerField.setText("L");
		  }
		  if(e.getSource()==MButton) {
			  answerField.setText("M");
		  }
		  if(e.getSource()==NButton) {
			  answerField.setText("N");
		  }
		  if(e.getSource()==OButton) {
			  answerField.setText("O");
		  }
		  if(e.getSource()==PButton) {
			  answerField.setText("P");
		  }
		  if(e.getSource()==QButton) {
			  answerField.setText("Q");
		  }
		  if(e.getSource()==RButton) {
			  answerField.setText("R");
		  }
		  if(e.getSource()==SButton) {
			  answerField.setText("S");
		  }
		  if(e.getSource()==TButton) {
			  answerField.setText("T");
		  }
		  if(e.getSource()==UButton) {
			  answerField.setText("U");
		  }
		  if(e.getSource()==VButton) {
			  answerField.setText("V");
		  }
		  if(e.getSource()==WButton) {
			  answerField.setText("W");
		  }
		  if(e.getSource()==XButton) {
			  answerField.setText("X");
		  }
		  if(e.getSource()==YButton) {
			  answerField.setText("Y");
		  }
		  if(e.getSource()==ZButton) {
			  answerField.setText("Z");
		  }
		  if(e.getSource()==exitButton) {
			  setVisible(false);
			   new menu();
		  }
		  
		  // -----
		  if(queCount==9) {
			  new ScoreCard(righCount);
			  dispose();
			  return;
		  }
		  if(Question.getAns(queCount).equals(answerField.getText())){
			  righCount++;
			  remarksField.setText("     Right!!");
			  
		  }
		  else {
			  wrongCount++;
			  remarksField.setText("   Wrong!Right answer is "+Question.getAns(queCount));
			  
		  }
		  String w = Integer.toString(wrongCount);
		  wrongCounterField.setText(w);
		  w = Integer.toString(righCount);
		  rightCounterField.setText(w);
		  queCount++;
		  textField.setText(Question.getQue(queCount));
		}
		
		public static void main(String[] args) {
			new AlphabetGameForKids();

		}
	}