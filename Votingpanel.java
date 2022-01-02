package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Votingpanel extends JFrame {

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
	//votingpanel
	public Votingpanel() {
			setTitle("Voting Panel");
			setBackground(new Color(255, 160, 122));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 724, 517);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 218, 185));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Indian National Congress");
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(6, 62, 165, 35);
			contentPane.add(rdbtnNewRadioButton);
			
			JLabel lblNewLabel = new JLabel("C h o o s e    y o u r    p a r t y    b e l o w ");
			lblNewLabel.setForeground(new Color(148, 0, 211));
			lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 18));
			lblNewLabel.setBounds(80, 0, 540, 35);
			contentPane.add(lblNewLabel);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bhartya Janta Party");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(6, 153, 165, 35);
			contentPane.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNationalCongressParty = new JRadioButton("National Congress Party");
			buttonGroup.add(rdbtnNationalCongressParty);
			rdbtnNationalCongressParty.setBounds(6, 245, 165, 35);
			contentPane.add(rdbtnNationalCongressParty);
			
			JRadioButton rdbtnShivsena = new JRadioButton("Shivsena");
			buttonGroup.add(rdbtnShivsena);
			rdbtnShivsena.setBounds(6, 337, 165, 35);
			contentPane.add(rdbtnShivsena);
			
			JRadioButton rdbtnAimim = new JRadioButton("AIMIM");
			buttonGroup.add(rdbtnAimim);
			rdbtnAimim.setBounds(6, 437, 165, 35);
			contentPane.add(rdbtnAimim);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Compaq\\Pictures\\CONGGGA.jpeg"));
			lblNewLabel_1.setBounds(217, 54, 221, 50);
			contentPane.add(lblNewLabel_1);
			
			JLabel label = new JLabel("New label");
			label.setIcon(new ImageIcon("C:\\Users\\Compaq\\Pictures\\bp.jpg"));
			label.setBounds(217, 153, 221, 50);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("New label");
			label_1.setIcon(new ImageIcon("C:\\Users\\Compaq\\Pictures\\NCOOP.jpeg"));
			label_1.setBounds(217, 245, 221, 50);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("New label");
			label_2.setIcon(new ImageIcon("C:\\Users\\Compaq\\Pictures\\shivsena.jpg"));
			label_2.setBounds(217, 329, 221, 50);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("New label");
			label_3.setIcon(new ImageIcon("C:\\Users\\Compaq\\Pictures\\AIMIM.jpg"));
			label_3.setBounds(217, 422, 221, 50);
			contentPane.add(label_3);
			
			JButton btnNewButton = new JButton("VOTE");
			btnNewButton.addComponentListener((ComponentListener) new ComponentAdapter() {
				@Override
				public void componentHidden(ComponentEvent e) {
					
				}
			});
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
			btnNewButton.setForeground(new Color(148, 0, 211));
			btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 18));
			btnNewButton.setBounds(551, 225, 128, 80);
			contentPane.add(btnNewButton);
		}
		private class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "SwingAction");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
			}
			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
	}
