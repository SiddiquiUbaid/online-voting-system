package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Csubmit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Csubmit frame = new Csubmit();
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
	//csubmit
	/**
		 * Create the frame.
		 */
		public Csubmit() {
			setTitle("Candidate Login");
			setBackground(new Color(255, 165, 0));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 724, 511);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(173, 255, 47));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblCandidateSubmit = new JLabel("Candidate Submit");
			lblCandidateSubmit.setForeground(new Color(0, 0, 205));
			lblCandidateSubmit.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
			lblCandidateSubmit.setHorizontalAlignment(SwingConstants.CENTER);
			lblCandidateSubmit.setBounds(187, 33, 273, 62);
			contentPane.add(lblCandidateSubmit);
			
			JLabel lblNewLabel = new JLabel("UniqueID");
			lblNewLabel.setForeground(new Color(205, 92, 92));
			lblNewLabel.setFont(new Font("Papyrus", Font.BOLD, 15));
			lblNewLabel.setBounds(10, 182, 172, 37);
			contentPane.add(lblNewLabel);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setForeground(new Color(205, 92, 92));
			lblPassword.setFont(new Font("Papyrus", Font.BOLD, 15));
			lblPassword.setBounds(10, 279, 172, 37);
			contentPane.add(lblPassword);
			
			JTextField textField = new JTextField();
			textField.setBackground(new Color(255, 240, 245));
			textField.setBounds(217, 182, 214, 37);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JPasswordField passwordField = new JPasswordField();
			passwordField.setBounds(217, 279, 214, 37);
			contentPane.add(passwordField);
			
			JButton btnNewButton = new JButton("Submit\r\n");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cpanel cpanel=new Cpanel();
					cpanel.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 128));
			btnNewButton.setFont(new Font("Segoe Script", Font.BOLD, 15));
			btnNewButton.setBounds(269, 388, 111, 47);
			contentPane.add(btnNewButton);
		}
	}
