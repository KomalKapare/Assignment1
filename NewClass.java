
Import java.sql.*;

import java.sql.DriverManager;

class OracleCon{
    public satatic vaid main(String args[]) {
     try{
        
         Class.forName("com.mysql.jdbc.Driver");
         
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_practiseecode","tbl_emp"); 
         
         Statement stmt=con.createStatement();
         
         ResultSet rs=stmt.executeQuery("Select*from emp");
         while(rs.next())
         System.out.println(rs.getInt(1))+" "+rs.getString(2)+" "+rs.getString(3));
       
     }
     catch(Exception e){System.out.println(e);}
    }
}

