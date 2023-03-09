package BUSINESSNEXT.SBCGOLD8.COMMON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDbConnection {
	 static String Loginid ;
	public static String dboracleConnection( String leadid)
	{
	 Connection conn= null;

	    try {

	            Class.forName("oracle.jdbc.OracleDriver");
	            String dbURL2 =  "jdbc:oracle:thin:@192.168.0.236:1521/TPBANK122";
	            String username = "SBC_UPGRADE_GOLD7";
	            String password = "abc123";
	            conn = DriverManager.getConnection(dbURL2, username, password);
	            if (conn != null) {
	                System.out.println("Connected with connection #1");
	            }
	            Statement st=conn.createStatement();
	            String sql1="select Loginid from az_user where userid in (select distinct leadownerid from leads where leadid=";
	            String sql2=" ) and AppOwnerID=608 and rownum = 1";
	            String sql=sql1+leadid+sql2;
	              
	            //String sql="select Loginid from az_user where userid in (select distinct leadownerid from leads where leadid='\"+leadid+\"') and AppOwnerID=608 and rownum = 1";
	            ResultSet rs=st.executeQuery(sql);
	            while( rs.next() ){
	            Loginid=rs.getString(1);
	            System.out.println("Lead assigned to :"+Loginid);

	             }
	             }
	            catch (ClassNotFoundException ex)
	            {
	            ex.printStackTrace();
	            }
	           catch (SQLException ex)
	            {
	            ex.printStackTrace();
	            }
	           finally {
	            try {
	                if (conn != null && !conn.isClosed())
	                {
	                    conn.close();
	                }
	               }
	            catch (SQLException ex)
	            {
	                ex.printStackTrace();
	            }

	               }
		return Loginid;


	    }

}
