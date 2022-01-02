package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Apanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apanel frame = new Apanel();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//apanel
	/**
		 * Create the frame.
		 */
		public Apanel() {
			setTitle("Admin Panel");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 709, 521);
			contentPane = new JPanel();
			contentPane.setBackground(Color.CYAN);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblAdministratorPanel = new JLabel("Administrator Panel");
			lblAdministratorPanel.setForeground(Color.MAGENTA);
			lblAdministratorPanel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
			lblAdministratorPanel.setHorizontalAlignment(SwingConstants.CENTER);
			lblAdministratorPanel.setBounds(111, 11, 476, 47);
			contentPane.add(lblAdministratorPanel);
			
			JButton btnNewButton = new JButton("Voting Panel");
			btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 20));
			btnNewButton.setForeground(Color.RED);
			btnNewButton.setBounds(175, 111, 334, 58);
			contentPane.add(btnNewButton);
			
			JButton btnAddCandidate = new JButton("Add Candidate");
			btnAddCandidate.setForeground(Color.RED);
			btnAddCandidate.setFont(new Font("Snap ITC", Font.PLAIN, 20));
			btnAddCandidate.setBounds(175, 220, 334, 58);
			contentPane.add(btnAddCandidate);
			
			JButton btnResult = new JButton("Result");
			btnResult.setForeground(Color.RED);
			btnResult.setFont(new Font("Snap ITC", Font.PLAIN, 20));
			btnResult.setBounds(175, 327, 334, 58);
			contentPane.add(btnResult);
		}
	}
