import java.sql.*;
import java.util.Scanner;
//import java.sql.*;

public class Main {
    public static void main(String[] args) {
           String url = "jdbc:postgresql://localhost:5432/demo";
           String username = "postgres";
           String password = "mypassword123";
Scanner sc = new Scanner(System.in);
int id = 105;
           String sql = "select * from Students where sid = ?" ;

           try {
               Connection c = DriverManager.getConnection(url, username, password);
               System.out.println("connection successful");
               Statement s = c.createStatement();
//               ResultSet rs = s.executeQuery(sql);
              int insert = s.executeUpdate("INSERT INTO students Values(107,'Priya',80)");
//               rs.next();
//               System.out.println(rs.getInt("sid"));
//               System.out.println(rs.getString("sname"));
//               System.out.println(rs.getInt("marks"));
//               rs.next();

//               while(rs.next()){
//                   System.out.println(rs.getInt("sid"));
//               System.out.println(rs.getString("sname"));
//               System.out.println(rs.getInt("marks"));
//               }
//
               c.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }

    }
}