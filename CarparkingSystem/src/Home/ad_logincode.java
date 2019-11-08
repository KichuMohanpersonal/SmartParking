package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ad_logincode {
	void log(String name,String password)
	{
	
		String db = "jdbc:mysql://127.0.0.1:3306/car_parking";
		String user = "root";
		String pass = "";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query= "select * from adlogin where name= ('"+name+"') and password= ('"+password+"')";
			
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()){
				
				//adtab.java for UI
				adtab obj=new adtab(); 
				obj.setVisible(true);	
			}
			else
				JOptionPane.showMessageDialog(null, "Wrong Password or user name");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
