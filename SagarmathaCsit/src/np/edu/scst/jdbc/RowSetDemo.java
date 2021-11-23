/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.jdbc;

import java.sql.*;
import javax.sql.rowset.*;

/**
 *
 * @author dell
 */
public class RowSetDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/javacsit");
        rs.setUsername("root");
        rs.setPassword("123456");
        
        rs.setCommand("select * from student");
        rs.execute();
        while (rs.next()) {
            System.out.println(rs.getInt("id")+ "\t");
            System.out.println(rs.getString("name")+ "\t");
            System.out.println(rs.getInt("class")+ "\t");
            System.out.println(rs.getString("department")+ "\t");
            
        }
        rs.close();
    }
}
