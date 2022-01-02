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

public class Cpanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpanel frame = new Cpanel();
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

	//cpanel
	/**
		 * Create the frame.
		 */
		public Cpanel() {
			setTitle("Candidate Panel");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 711, 510);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(128, 0, 128));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblCandidate = new JLabel("Candidate");
			lblCandidate.setFont(new Font("Showcard Gothic", Font.PLAIN, 24));
			lblCandidate.setHorizontalAlignment(SwingConstants.CENTER);
			lblCandidate.setBounds(115, 11, 455, 53);
			contentPane.add(lblCandidate);
			
			JButton btnNewButton = new JButton("Notifications");
			btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 15));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(208, 115, 266, 49);
			contentPane.add(btnNewButton);
			
			JButton btnVote = new JButton("Vote");
			btnVote.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Votingpanel votingpanel = new Votingpanel();
					votingpanel.setVisible(true);
					
					// sets frames unable to resize
					votingpanel.setResizable(false);
					
					// sets frames in center
					votingpanel.setLocationRelativeTo(null);
					
					dispose();

				}
			});
			btnVote.setFont(new Font("Stencil", Font.PLAIN, 15));
			btnVote.setBounds(208, 219, 266, 49);
			contentPane.add(btnVote);
			
			JButton btnClose = new JButton("Close");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnClose.setFont(new Font("Stencil", Font.PLAIN, 15));
			btnClose.setBounds(208, 327, 266, 49);
			contentPane.add(btnClose);
		}
	}
