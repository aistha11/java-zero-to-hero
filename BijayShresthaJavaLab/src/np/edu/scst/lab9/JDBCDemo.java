/*
 *Write a java program using JDBC to extract the name of those avengers who live on planet "earth", assuming that the "avengers" table has four attributes (id, name, super_power, planet).
 */
package np.edu.scst.lab9;
import java.sql.*;

public class JDBCDemo {
        public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javacsit", "root", "123456");
        Statement stm = con.createStatement();
        String select = "SELECT * FROM avengers WHERE planet='Earth'";
        ResultSet rs = stm.executeQuery(select);
        while(rs.next()){
            System.out.print("iD="+rs.getString("id")+"\t");
            System.out.print("name="+rs.getString("name")+"\t");
            System.out.print("super_power="+rs.getString("super_power")+"\t");
            System.out.println("planet="+rs.getString("planet")+"\t");
        }
        con.close();
    }
}
