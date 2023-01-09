import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class DEPOSIT extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DEPOSIT frame = new DEPOSIT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DEPOSIT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(43, 10, 81, 171);
		getContentPane().add(panel);
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
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Enter  Details");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(117, 13, 120, 22);
		panel_1.add(lblNewLabel_1);
		
		
		JTextField textField = new JTextField();
		textField.setBounds(174, 45, 170, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		
		btnNewButton.addActionListener(new ActionListener() {
			private Window frame;

			public void actionPerformed(ActionEvent arg0) {try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","ANSHUtiwari235");
				Statement stmt=con.createStatement();
				String sql="select * from userinfo where account_number='"+textField.getText() +"'and pin='"+passwordField.getText().toString()+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,  "login sucessfully...");
				
			    @SuppressWarnings("unused")
				DEPOSIT2  deposit2Info=new DEPOSIT2();
			    deposit2Info.show();
			    frame.dispose();
				}	
				else
					JOptionPane.showMessageDialog(null,  "login incorrect...");
				con.close();
			}catch(Exception e) {System.out.print(e);;}

							}
		});
		
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(134, 140, 85, 21);
		panel_1.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 77, 170, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Account_Number");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 45, 140, 22);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile_Number");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(10, 77, 140, 22);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pin");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(10, 108, 109, 22);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 109, 170, 19);
		panel_1.add(passwordField);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.scrollbar);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(498, 10, 81, 171);
		getContentPane().add(panel_2);
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
		getContentPane().add(panel_3);
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
