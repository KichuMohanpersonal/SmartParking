package Home; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class delete {
	/**
	 * @wbp.parser.entryPoint
	 */
	void delete(String con_no)
	{
	
		String db = "jdbc:mysql://127.0.0.1:3306/car_parking";
		String user = "root";
		String pass = "";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "delete from information  where con_no =('"+con_no+"')";
			//String query1 = "delete from bill  where connection_no ="+ con_no;
			//stmt.executeUpdate(query1);
			stmt.executeUpdate(query);

			JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
