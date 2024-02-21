import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.DriverManager;

public class inser {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            Connection con=DriverManager.getConnection(url, "root","rupam@123");
            // if(con.isClosed()){
            //     System.out.println("Connection is closed");
            // }else{
            //     System.out.println("Connection is created");
            // }
            String q="insert into table1(tName, tcity) values(?,?)";
            PreparedStatement stmt=con.prepareStatement(q);
            // stmt.setString(1,"Gunjan");
            // stmt.setString(2,"sultanpur");
            // stmt.executeUpdate();
            BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter the name: ");
            String name=br.readLine();
            System.out.println("Enter the City: ");
            String city=br.readLine();
            //insert
             stmt.setString(1,name);
             stmt.setString(2,city);
             stmt.executeUpdate();
            

            System.out.println("insert the data ....");
            
        } catch (Exception e) {
             
            e.printStackTrace();
        }
    }
}
