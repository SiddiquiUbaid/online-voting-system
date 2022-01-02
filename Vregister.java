package ovs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Vregister extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vregister frame = new Vregister();
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
	//vregister
	public Vregister() {
			setTitle("Voter Registration");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 709, 516);
			contentPane = new JPanel();
			contentPane.setBackground(Color.CYAN);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Voter Registration");
			lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(169, 11, 366, 46);
			contentPane.add(lblNewLabel);
			
			JLabel lbl_1 = new JLabel("Name");
			lbl_1.setHorizontalAlignment(SwingConstants.LEFT);
			lbl_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
			lbl_1.setBounds(10, 108, 197, 46);
			contentPane.add(lbl_1);
			
			JLabel lbl_2 = new JLabel("Address");
			lbl_2.setHorizontalAlignment(SwingConstants.LEFT);
			lbl_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
			lbl_2.setBounds(10, 183, 197, 46);
			contentPane.add(lbl_2);
			
			JLabel lblAdaharid = new JLabel("AdaharID");
			lblAdaharid.setHorizontalAlignment(SwingConstants.LEFT);
			lblAdaharid.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
			lblAdaharid.setBounds(10, 261, 197, 46);
			contentPane.add(lblAdaharid);
			
			JLabel lblRefvoterid = new JLabel("RefvoterID");
			lblRefvoterid.setHorizontalAlignment(SwingConstants.LEFT);
			lblRefvoterid.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
			lblRefvoterid.setBounds(10, 338, 197, 46);
			contentPane.add(lblRefvoterid);
			
			JTextField Name = new JTextField();
			Name.setBounds(246, 120, 204, 34);
			contentPane.add(Name);
			Name.setColumns(10);
			
			JTextField Adhar = new JTextField();
			Adhar.setColumns(10);
			Adhar.setBounds(246, 273, 204, 34);
			contentPane.add(Adhar);
			
			JTextField RefID = new JTextField();
			RefID.setColumns(10);
			RefID.setBounds(246, 350, 204, 34);
			contentPane.add(RefID);
			
			JButton btnNewButton = new JButton("Register");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					URsuccessful ur=new URsuccessful();
					ur.setVisible(true);
					dispose();
					
					try {
						// TODO Auto-generated method stub
						String url="jdbc:mysql://localhost:3306/ovs";
						String username="root";
						String password="ubaid";
						String query="INSERT INTO uregister(Name, Address) " + " VALUES(Name, Address)";
						
						String name=Name.getText();
						AbstractButton Address = null;
						String address=Address.getText();
						String adharid=Adhar.getText();
						String refid=RefID.getText();
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection(url,username,password);
				        Statement st=(Statement) con.createStatement();
				        
				        int[] name1 = null;
						
						PreparedStatement pst= con.prepareStatement("insert into uregister(Name, Address, Adhar, RefID)" + "values( ?, ?, ?, ?)");
						pst.setString(1, name);
						pst.setString(2, address);
						pst.setString(3, adharid);
						pst.setString(4, refid);
						
						
						pst.execute();
				        
				        
				       
				        ((Connection) st).close();
				        con.close();
						}
						catch(Exception f) {System.out.println(e);}
				        
				}
			});
			btnNewButton.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 15));
			btnNewButton.setBounds(289, 433, 125, 34);
			contentPane.add(btnNewButton);
			
			JTextField Address = new JTextField();
			Address.setBounds(246, 183, 204, 64);
			contentPane.add(Address);
			Address.setColumns(10);
		}
	}



