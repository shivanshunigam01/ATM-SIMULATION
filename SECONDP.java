import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class SECONDP extends JFrame {

	private static final long C = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SECONDP frame = new SECONDP();
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
	@SuppressWarnings("null")
	public SECONDP() {
		getContentPane().setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(43, 10, 81, 171);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WITHDRAW nw = new WITHDRAW();
				nw.NewScreen();
			}
			});
		
		btnNewButton_5.setBounds(14, 22, 53, 47);
		panel.add(btnNewButton_5);
		
		
		JButton btnNewButton_51 = new JButton("");
		btnNewButton_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				DEPOSIT n = new DEPOSIT();
				n.NewScreen();
			}
			});
		
		btnNewButton_51.setBounds(14, 97, 53, 47);
		panel.add(btnNewButton_51);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(134, 10, 354, 171);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WITHDRAW");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 31, 95, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblDeposit = new JLabel("DEPOSIT");
		lblDeposit.setFont(new Font("Arial", Font.BOLD, 16));
		lblDeposit.setBounds(10, 106, 78, 29);
		panel_1.add(lblDeposit);
		
		JLabel lblBillPayment = new JLabel("PIN CHANGE");
		lblBillPayment.setFont(new Font("Arial", Font.BOLD, 16));
		lblBillPayment.setBounds(243, 106, 101, 29);
		panel_1.add(lblBillPayment);
		
		JLabel lblBalanceInquiry = new JLabel("BALANCE INQUIRY");
		lblBalanceInquiry.setFont(new Font("Arial", Font.BOLD, 16));
		lblBalanceInquiry.setBounds(192, 31, 152, 29);
		panel_1.add(lblBalanceInquiry);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.scrollbar);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(498, 10, 81, 171);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5_1_1 = new JButton("");
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg3) {
				BILLPAYMENT n = new BILLPAYMENT();
				n.NewScreen();
			}
			});
		
		
		btnNewButton_5_1_1.setBounds(14, 97, 53, 47);
		panel_2.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg3) {
				BALANCE n = new BALANCE();
				n.NewScreen();
			}
			});
		
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
