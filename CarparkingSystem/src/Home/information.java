package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class information {
	void insert(String con_no, String token_no,String date,String time,String day)
	{
	
		String db = "jdbc:mysql://127.0.0.1:3306/car_parking";
		String user = "root";
		String pass = "";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "insert into information values('"+con_no+"','"+token_no+"','"+date+"','"+time+"','"+day+"')";
			
			stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Slot Booked Sucessfully");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Slot Already Booked");
		}
		
		
		
	}
	


}
