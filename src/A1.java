import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class A1 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A1 window = new A1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public A1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(43, 10, 81, 171);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(14, 22, 53, 47);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.setBounds(14, 97, 53, 47);
		panel.add(btnNewButton_5_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(134, 10, 354, 171);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(56, 42, 67, 22);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(56, 79, 85, 22);
		panel_1.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 79, 145, 22);
		panel_1.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(151, 42, 145, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("LOGIN");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","ANSHUtiwari235");
				Statement stmt=con.createStatement();
				String sql="select * from login where LoginID='"+textField.getText() +"' and Password='"+passwordField.getText().toString()+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,  "login sucessfully...");
				frame.dispose();
				SECONDP secondpInfo=new SECONDP();
				secondpInfo.setVisible(true);
				}	
				else
					JOptionPane.showMessageDialog(null,  "login incorrect...");
				con.close();
			}catch(Exception e) {System.out.print(e);;}

							}
		});
		btnNewButton_6.setBounds(134, 132, 85, 29);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.scrollbar);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(498, 10, 81, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5_1_1 = new JButton("");
		btnNewButton_5_1_1.setBounds(14, 97, 53, 47);
		panel_2.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.setBounds(14, 22, 53, 47);
		panel_2.add(btnNewButton_5_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlShadow);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(43, 191, 536, 359);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1.setBounds(16, 36, 121, 64);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_2.setForeground(SystemColor.activeCaptionText);
		btnNewButton_2.setBounds(16, 110, 121, 64);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1_1.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1_1.setBounds(147, 36, 121, 64);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_2_1.setForeground(SystemColor.activeCaptionText);
		btnNewButton_2_1.setBounds(147, 110, 121, 64);
		panel_3.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("3");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1_1_1.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1_1_1.setBounds(278, 36, 121, 64);
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("6");
		btnNewButton_2_1_1.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_2_1_1.setForeground(SystemColor.activeCaptionText);
		btnNewButton_2_1_1.setBounds(278, 110, 121, 64);
		panel_3.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("BACK");
		btnNewButton_1_1_1_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBounds(403, 36, 121, 64);
		panel_3.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("CLEAR");
		btnNewButton_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_1_1_1.setForeground(new Color(139, 0, 0));
		btnNewButton_2_1_1_1.setBounds(403, 110, 121, 64);
		panel_3.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("7");
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1_2.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1_2.setBounds(16, 184, 121, 64);
		panel_3.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("8");
		btnNewButton_1_1_2.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1_1_2.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1_1_2.setBounds(147, 184, 121, 64);
		panel_3.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("9");
		btnNewButton_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_1_1_1_2.setForeground(SystemColor.activeCaptionText);
		btnNewButton_1_1_1_2.setBounds(278, 184, 121, 64);
		panel_3.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("ENTER");
		btnNewButton_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1_1_1_1.setBounds(403, 184, 121, 64);
		panel_3.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1.setBounds(403, 258, 121, 64);
		panel_3.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_1_1_2 = new JButton("");
		btnNewButton_2_1_1_2.setBounds(278, 258, 121, 64);
		panel_3.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_2_1_2 = new JButton("0");
		btnNewButton_2_1_2.setFont(new Font("Arial", Font.BOLD, 40));
		btnNewButton_2_1_2.setForeground(SystemColor.activeCaptionText);
		btnNewButton_2_1_2.setBounds(147, 258, 121, 64);
		panel_3.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBounds(16, 258, 121, 64);
		panel_3.add(btnNewButton_2_2);
	}
}
