package Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;





public class select {
	
	void selection(String slot)
	{
	
		String db = "jdbc:mysql://127.0.0.1:3306/car_parking";
		String user = "root";
		String pass = "";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "select * from information where slot =" +slot;
			
			ResultSet rs = stmt.executeQuery(query);			
			if(!rs.next()) {
				JOptionPane.showMessageDialog(null, "No Record Found");
				tab.textField_14.setText("");
			}
			else {
				tab.textField_14.setText(rs.getString("booked"));
			/*	tab.textField_15.setText(rs.getString(3));
				tab.textField_16.setText(rs.getString(4));
				tab.textField_17.setText(rs.getString(5));
				*/
				
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		
		




