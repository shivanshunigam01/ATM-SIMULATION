import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class DEPOSIT2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DEPOSIT2 frame = new DEPOSIT2();
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
	public DEPOSIT2() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 31, 128, 22);
		panel_1.add(lblNewLabel_1);
		
		
		JTextField textField = new JTextField();
		textField.setBounds(164, 31, 159, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root","ANSHUtiwari235");
				Statement stmt=con.createStatement(); 
				int value=Integer.parseInt(textField.getText());
				ResultSet rs = null;
				PreparedStatement p = null;
				String sql = "select * from userinfo";
	            p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	            int ac = Integer.parseInt(textField_1.getText());;
				while(rs.next())
				{
					int ano = rs.getInt("pin");
					int bal = rs.getInt("balance");
					if (ac==ano)
					{
						bal = bal+value;
						stmt.executeUpdate("update userinfo set balance ='"+bal +"'WHERE pin = '"+ac+"'");
						System.out.println("database updated");	
						JOptionPane.showMessageDialog(null,  "Deposit Sucessfully...");
					}
				}
					
				}
				catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
			}
		});
		
		
		
		
		
		
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(127, 125, 99, 25);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Pin");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(21, 80, 117, 22);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(164, 80, 159, 22);
		panel_1.add(textField_1);
		
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
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
