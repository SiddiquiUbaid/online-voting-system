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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Clogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clogin frame = new Clogin();
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
	//clogin
	public Clogin() {
			setTitle("Candidate");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 702, 524);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 215, 0));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Candidate   Login\r\n");
			lblNewLabel.setForeground(new Color(0, 100, 0));
			lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(166, 11, 337, 67);
			contentPane.add(lblNewLabel);
			
			JButton btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Csubmit csubmit = new Csubmit();
					csubmit.setVisible(true);
					
					// sets frames unable to resize
					csubmit.setResizable(false);
					
					// sets frames in center
					csubmit.setLocationRelativeTo(null);
					
					dispose();

				}
			});
			btnNewButton.setFont(new Font("Segoe Script", Font.BOLD, 20));
			btnNewButton.setBounds(240, 126, 193, 52);
			contentPane.add(btnNewButton);
			
			JLabel lblNewLabel_1 = new JLabel("New Candidate ? \r\n Click below to Register.");
			lblNewLabel_1.setForeground(new Color(255, 0, 0));
			lblNewLabel_1.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(166, 236, 357, 57);
			contentPane.add(lblNewLabel_1);
			
			JButton btnNewButton_1 = new JButton("Register");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cregister cregister=new Cregister();
					cregister.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnNewButton_1.setBounds(240, 304, 193, 52);
			contentPane.add(btnNewButton_1);
		}
	}



