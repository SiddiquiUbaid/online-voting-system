package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cregister extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cregister frame = new Cregister();
					frame.setVisible(true);
					
					// sets frames unable to resize
					frame.setResizable(false);
					
					// sets frames in center
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//cregister
	/**
		 * Create the frame.
		 */
		public Cregister() {
			setTitle("Candidate Registration");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 731, 519);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(128, 128, 0));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblCandidateRegister = new JLabel("Candidate Register");
			lblCandidateRegister.setForeground(new Color(128, 0, 0));
			lblCandidateRegister.setFont(new Font("Segoe Print", Font.BOLD, 25));
			lblCandidateRegister.setHorizontalAlignment(SwingConstants.CENTER);
			lblCandidateRegister.setBounds(129, 11, 450, 44);
			contentPane.add(lblCandidateRegister);
			
			JLabel lblNewLabel = new JLabel("Name");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(128, 0, 128));
			lblNewLabel.setFont(new Font("Ravie", Font.BOLD, 15));
			lblNewLabel.setBounds(10, 125, 178, 44);
			contentPane.add(lblNewLabel);
			
			JLabel lblArea = new JLabel("Area");
			lblArea.setHorizontalAlignment(SwingConstants.CENTER);
			lblArea.setForeground(new Color(128, 0, 128));
			lblArea.setFont(new Font("Ravie", Font.BOLD, 15));
			lblArea.setBounds(10, 199, 178, 44);
			contentPane.add(lblArea);
			
			JLabel lblTicketNo = new JLabel("Ticket NO.");
			lblTicketNo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTicketNo.setForeground(new Color(128, 0, 128));
			lblTicketNo.setFont(new Font("Ravie", Font.BOLD, 15));
			lblTicketNo.setBounds(10, 272, 178, 44);
			contentPane.add(lblTicketNo);
			
			JLabel lblParty = new JLabel("Party");
			lblParty.setHorizontalAlignment(SwingConstants.CENTER);
			lblParty.setForeground(new Color(128, 0, 128));
			lblParty.setFont(new Font("Ravie", Font.BOLD, 15));
			lblParty.setBounds(10, 352, 178, 44);
			contentPane.add(lblParty);
			
			JTextField textField = new JTextField();
			textField.setBounds(198, 135, 205, 34);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JTextField textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(198, 209, 205, 34);
			contentPane.add(textField_1);
			
			JTextField textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(198, 282, 205, 34);
			contentPane.add(textField_2);
			
			JTextField textField_3 = new JTextField();
			textField_3.setBounds(198, 362, 205, 34);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			
			JButton btnRegister = new JButton("Register");
			btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnRegister.setBounds(245, 436, 114, 34);
			contentPane.add(btnRegister);
		}
	}
