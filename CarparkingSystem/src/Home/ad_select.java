package Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;





public class ad_select {
	
	void selection(String slot)
	{
	
		String db = "jdbc:mysql://127.0.0.1:3306/car_parking";
		String user = "root";
		String pass = "";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "select * from information where slot = ('"+slot+"')";
			
			ResultSet rs = stmt.executeQuery(query);			
			if(!rs.next()) {
				adtab.textField_15.setText("");
				adtab.textField_16.setText("");
				adtab.textField_17.setText("");
				JOptionPane.showMessageDialog(null, "Slot is not Booked");
				tab.textField_14.setText("");
			}
			else {
				//adtab.textField_15.setText(rs.getString("booked"));
				adtab.textField_15.setText(rs.getString("con_no"));
				adtab.textField_16.setText(rs.getString("token_no"));
				adtab.textField_17.setText(rs.getString("date"));
				
				
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		
		




