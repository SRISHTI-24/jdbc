import javax.swing.plaf.nimbus.State;
import java.util.Scanner;
import java.sql.*;
public class jdbcdemo1 {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oops","root","");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from form where name= srishti" + name);
            while(rs.next())
            {
                System.out.println(rs.getString("name") +" "+rs.getInt("roll no."));
            }
            PreparedStatement ps = con.prepareStatement("select * from form name = ?");
            ps.setString(1,name);
            rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println();
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
