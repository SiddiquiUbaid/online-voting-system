//DBconnection
package ovs;

import java.sql.*;

public class DbCon {

	

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/ovs";
		String username="root";
		String password="ubaid";
		String query="INSERT INTO uregister(Name, Address) " + " VALUES('munna', 'india')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        
        int[] name1 = null;
		
		PreparedStatement pst= con.prepareStatement("insert into uregister(Name, Address)" + "values( ?, ?)");
		pst.setString(1, "munna");
		pst.setString(2, "INDIA");
		
		
		pst.execute();
        
        
       
        st.close();
        con.close();
		}
		catch(Exception e) {System.out.println(e);}
        
        
	}

}
