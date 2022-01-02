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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Usubmit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usubmit frame = new Usubmit();
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
	//usubmit
	public Usubmit() {
			setTitle("Voter Login");
			setBackground(Color.DARK_GRAY);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 724, 511);
			contentPane = new JPanel();
			contentPane.setBackground(Color.PINK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter Details to Submit");
			lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
			lblNewLabel.setBounds(252, 11, 243, 70);
			contentPane.add(lblNewLabel);
			
			JLabel lblUsername = new JLabel("Username:");
			lblUsername.setFont(new Font("Verdana", Font.BOLD, 15));
			lblUsername.setLabelFor(this);
			lblUsername.setBounds(10, 165, 130, 38);
			contentPane.add(lblUsername);
			
			JLabel lblUserid = new JLabel("UserID:");
			lblUserid.setFont(new Font("Verdana", Font.BOLD, 15));
			lblUserid.setBounds(10, 240, 130, 38);
			contentPane.add(lblUserid);
			
			JLabel lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Verdana", Font.BOLD, 15));
			lblPassword.setBounds(10, 309, 130, 38);
			contentPane.add(lblPassword);
			
			JTextField textField = new JTextField();
			textField.setBounds(170, 176, 173, 27);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JTextField textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(170, 251, 173, 27);
			contentPane.add(textField_1);
			
			JTextField textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(170, 320, 173, 27);
			contentPane.add(textField_2);
			
			JButton btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Votingpanel vpanel=new Votingpanel();
					vpanel.setVisible(true);
					dispose();
				}
			});
			btnSubmit.setFont(new Font("Stencil", Font.BOLD, 15));
			btnSubmit.setBackground(new Color(255, 0, 0));
			btnSubmit.setBounds(200, 388, 130, 38);
			contentPane.add(btnSubmit);
		}
	}



