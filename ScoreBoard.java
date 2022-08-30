package Alpha3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ScoreBoard extends JFrame{
	
	private JTable table;
	private JButton menu, reset;
	private DefaultTableModel model;
	private String columns[] = {"Name", "Age", "Score"};
	private String[] data;
	private JScrollPane scroll;
	private TableRowSorter sorter;
	private Container c;
	private JButton btnReset;
	private JPanel panel;
	
	public ScoreBoard() {
		getContentPane().setBackground(new Color(233, 150, 122));
		setSize(546,540);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		// table
				table = new JTable();
				model = new DefaultTableModel();
				model.setColumnIdentifiers(columns);
				table.setModel(model);
				table.setSize(666,227);
				table.setLocation(10,326);
				sorter = new TableRowSorter<>(model);
		        table.setFont(new Font(null, Font.PLAIN, 15));
		        table.setSelectionBackground(Color.GREEN);
		        table.setBackground(Color.WHITE);
		        table.setRowHeight(30);
		        table.setRowSorter(sorter);
		        scroll = new JScrollPane(table);
		        scroll.setForeground(Color.GRAY);
		        scroll.setFont(new Font("Consolas", Font.BOLD, 15));
		        scroll.setBounds(10,91,512,349);
		        c.add(scroll);
		        
		        JButton btnNewButton = new JButton("Menu");
		        btnNewButton.setForeground(new Color(255, 255, 255));
		        btnNewButton.setBackground(new Color(205, 92, 92));
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		new menu();
		        		dispose();
		        	}
		        });
		        btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		        btnNewButton.setBounds(307, 447, 103, 43);
		        getContentPane().add(btnNewButton);
		        
		        btnReset = new JButton("Reset");
		        btnReset.setForeground(new Color(255, 255, 255));
		        btnReset.setBackground(new Color(205, 92, 92));
		        btnReset.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		File f1 = new File("Score.dat");
		        		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(f1))){
		        			out.write(null);
		        		}
		        		catch(Exception ex) {
		        			 JOptionPane.showMessageDialog(null, "File has been resetted",
		        				      "", JOptionPane.ERROR_MESSAGE);
		        		}
		        		new menu();
		        		dispose();
		        	}
		        });
		        btnReset.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		        btnReset.setBounds(138, 447, 103, 43);
		        getContentPane().add(btnReset);
		        
		        panel = new JPanel();
		        panel.setBackground(new Color(188, 143, 143));
		        panel.setBounds(11, 12, 511, 75);
		        getContentPane().add(panel);
		        panel.setLayout(null);
		        
		        JLabel lblNewLabel = new JLabel("Score Board");
		        lblNewLabel.setBounds(139, 1, 355, 62);
		        panel.add(lblNewLabel);
		        lblNewLabel.setForeground(new Color(255, 250, 240));
		        lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		        
		        data = new String[3];
		        
		        File f = new File("Score.dat");
		        try(DataInputStream in = new DataInputStream(new FileInputStream(f))){
		        	while(true) {
		        		data[0] = in.readUTF();
		        		data[1] = Integer.toString(in.readInt());
		        		data[2] = Integer.toString(in.readInt());
		        		model.addRow(data);
		        	}
		        }
		        catch(EOFException ex) {
		        	// no need
		        }
		        catch(Exception ex) {
		        	 JOptionPane.showMessageDialog(null, "Work done",
		        		      "", JOptionPane.ERROR_MESSAGE);		        	
		        }
		
		setVisible(true);
	}
}
