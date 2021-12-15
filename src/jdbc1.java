import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, NullPointerException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empl","root","");
        ResultSet rs;
        try (Statement s = con.createStatement()) {
            String st = "select * from emp where (salary > 1000 AND salary < 2000) ";
            rs = s.executeQuery(st);
            while (rs.next()) {
                System.out.println(rs.getString("name")+" "+rs.getString("salary")+" "+rs.getString("sec"));
            }
        }
        catch(SQLException e)
        {
            e.getMessage();
        }
 con.close();

    }
}
