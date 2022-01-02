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

public class URsuccessful extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					URsuccessful frame = new URsuccessful();
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
	//ursuccessful
	public URsuccessful() {
			setType(Type.POPUP);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 714, 484);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(138, 43, 226));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("YOU  HAVE  BEEN  REGISTERED  AS  A  VOTER  SUCCCESSFULLY !");
			lblNewLabel.setForeground(new Color(250, 235, 215));
			lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 11, 678, 150);
			contentPane.add(lblNewLabel);
			
			JLabel lblClickBelowButton = new JLabel("Click below button to get your unique voter ID");
			lblClickBelowButton.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 15));
			lblClickBelowButton.setHorizontalAlignment(SwingConstants.CENTER);
			lblClickBelowButton.setBounds(10, 184, 678, 72);
			contentPane.add(lblClickBelowButton);
			
			JButton btnNewButton = new JButton("c l i c k ");
			btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
			btnNewButton.setBounds(269, 326, 151, 43);
			contentPane.add(btnNewButton);
		}

	}



