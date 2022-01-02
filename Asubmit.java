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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Asubmit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asubmit frame = new Asubmit();
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

	//asubmit
	/**
		 * Create the frame.
		 */
		public Asubmit() {
			setTitle("Admin Login");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 685, 525);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLUE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Administrator Login");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Pristina", Font.BOLD, 25));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(62, 30, 498, 55);
			contentPane.add(lblNewLabel);
			
			JTextField textField = new JTextField();
			textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
			textField.setBounds(203, 157, 176, 36);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JTextField textField_1 = new JTextField();
			textField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(203, 282, 176, 36);
			contentPane.add(textField_1);
			
			JLabel lblNewLabel_1 = new JLabel("Admin ID");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 15));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(10, 156, 183, 36);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Snap ITC", Font.PLAIN, 15));
			lblPassword.setBounds(10, 281, 183, 36);
			contentPane.add(lblPassword);
			
			JButton btnNewButton = new JButton("Enter");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Apanel apanel=new Apanel();
					apanel.setVisible(true);
					
					// sets frames unable to resize
					apanel.setResizable(false);
					
					// sets frames in center
					apanel.setLocationRelativeTo(null);
					
					dispose();

				}
			});
			btnNewButton.setForeground(Color.BLUE);
			btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
			btnNewButton.setBounds(252, 394, 89, 29);
			contentPane.add(btnNewButton);
		}
	}
