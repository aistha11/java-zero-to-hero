/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.jdbc;

import java.sql.*;

public class CreateDB {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String DB_URL = "jdbc:mysql://localhost:3308/javacsit";
////        String DB_URL = "jdbc:mysql://localhost:3306/javacsit";
////        String host = "localhost:3306";
////        String dbName = "javacsit";
////        String user = "root";
////        String psw = ""+"123456";
//        Connection conn = DriverManager.getConnection(DB_URL,"root","");
////        Connection conn = DriverManager.getConnection(DB_URL,"root","123456");
//        Statement stm = conn.createStatement();
//        String upStudentSql = "update student set class = 12, department = 'BCA' where id = 2";
//         System.out.println(upStudentSql);
//        stm.executeUpdate(upStudentSql);
//        conn.close();
//    }

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

//        String DB_URL = "jdbc:mysql://localhost:3308/javacsit";
//        Connection conn = DriverManager.getConnection(DB_URL,"root","");
            String DB_URL = "jdbc:mysql://localhost:3306/javacsit";
            Connection con = DriverManager.getConnection(DB_URL, "root", "123456");
            Statement stm = con.createStatement();
            String upStudentSql = "update student set class = 12, department = 'BCA' where id = 2";
            System.out.println(upStudentSql);
            stm.executeUpdate(upStudentSql);
            con.close();
        } catch (SQLException exp) {
            System.out.println(exp);
        } catch (ClassNotFoundException cexp) {
            System.out.println("Class Not found");
        } finally {

        }
    }
}
