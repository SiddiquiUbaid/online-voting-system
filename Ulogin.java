package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Ulogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ulogin frame = new Ulogin();
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
	//ulogin
	public Ulogin() {
			setTitle("Voter Panel");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(150, 150, 728, 526);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 105, 180));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("V O T E R    L O G I N");
			lblNewLabel.setBackground(new Color(124, 252, 0));
			lblNewLabel.setForeground(new Color(148, 0, 211));
			lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 22));
			lblNewLabel.setBounds(171, 24, 346, 76);
			contentPane.add(lblNewLabel);
			
			JButton btnNewButton = new JButton("L o g i n");
			btnNewButton.setForeground(new Color(0, 0, 255));
			btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Usubmit usubmit=new Usubmit();
					usubmit.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(190, 140, 264, 57);
			contentPane.add(btnNewButton);
			
			JTextPane txtpnHh = new JTextPane();
			txtpnHh.setBackground(new Color(238, 130, 238));
			txtpnHh.setForeground(new Color(0, 0, 139));
			txtpnHh.setFont(new Font("Vani", Font.ITALIC, 14));
			txtpnHh.setText("If you are not registered as a voter, please click button below.");
			txtpnHh.setBounds(171, 288, 339, 57);
			contentPane.add(txtpnHh);
			
			JButton btnNewButton_1 = new JButton("Register ");
			Action action = null;
			btnNewButton_1.setAction(action);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Vregister vregister=new Vregister();
					vregister.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setActionCommand("Register ");
			btnNewButton_1.setForeground(new Color(0, 0, 255));
			btnNewButton_1.setFont(new Font("Stencil", Font.PLAIN, 15));
			btnNewButton_1.setBackground(new Color(255, 0, 0));
			btnNewButton_1.setBounds(254, 370, 154, 57);
			contentPane.add(btnNewButton_1);
		}
		private class SwingAction extends AbstractAction {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public SwingAction() {
				putValue(NAME, "Register");
				putValue(SHORT_DESCRIPTION, "register if you are new");
			}
			public void actionPerformed(ActionEvent e) {
			}
		}
	}



