package ovs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;
// experimental comment.
// experimental comment.
public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		pack();
//		setSize(screenSize.width,screenSize.height);
//		
		setTitle("Online Voting System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 450, 726, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(138, 43, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoter = new JLabel(" E N T E R   A S");
		lblVoter.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 22));
		lblVoter.setBounds(250, 11, 432, 53);
		lblVoter.setForeground(new Color(127, 255, 0));
		lblVoter.setBackground(new Color(0, 255, 0));
		contentPane.add(lblVoter);
		
		JButton btnVoter = new JButton("Administrator");
		btnVoter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Asubmit asubmit=new Asubmit();
				asubmit.setVisible(true);
				
				// sets frames unable to resize
				asubmit.setResizable(false);
				
				// sets frames in center
				asubmit.setLocationRelativeTo(null);
				
				dispose();
			}
		});
		btnVoter.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnVoter.setBounds(83, 338, 527, 72);
		btnVoter.setBackground(Color.PINK);
		
		btnVoter.setForeground(Color.GREEN);
		contentPane.add(btnVoter);
		
		JButton button = new JButton("Candidate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clogin clogin=new Clogin();
				clogin.setVisible(true);
				
				// sets frames unable to resize
				clogin.setResizable(false);
				
				// sets frames in center
				clogin.setLocationRelativeTo(null);
				
				dispose();
			}
		});
		button.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		button.setForeground(Color.GREEN);
		button.setBackground(Color.PINK);
		button.setBounds(83, 219, 527, 72);
		contentPane.add(button);
		
		JButton button_1 = new JButton("    voter");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ulogin ulogin=new Ulogin();
				ulogin.setVisible(true);
				
				// sets frames unable to resize
				ulogin.setResizable(false);
				
				// sets frames in center
				ulogin.setLocationRelativeTo(null);
				
				dispose();

			}
		});
		button_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		button_1.setIcon(null);
		button_1.setForeground(Color.GREEN);
		button_1.setBackground(Color.PINK);
		button_1.setBounds(83, 101, 527, 72);
		contentPane.add(button_1);
	}
}

	



