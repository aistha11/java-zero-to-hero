package np.edu.scst.jdbc;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=null;
        try{
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3308/javacsit",
                            //dburl/dbname
                            //username   password
                            "root", "");
            Statement stmnt = con.createStatement();
            String name="Shyam";
            String department="CSIT";
            int className = 12;
            float salary=15000f;
           // String insert = "INSERT INTO teachers(name,gender,salary) VALUES('"+  name+ "', '"+gender+"' ,"+salary+")";
            String insert = "INSERT INTO teachers(name,gender,salary) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1,name);
            ps.setInt(2,className);
            ps.setString(3,department);
            System.out.println(ps.executeUpdate());

            String createTable="CREATE TABLE " +
                    "test2( " +
                    "id INT(10), " +
                    "name VARCHAR(100), " +
                    "price FLOAT(10), " +
                    "elective VARCHAR(100), " +
                    "PRIMARY KEY (id) )";
            System.out.println(createTable);
            stmnt.execute(createTable);

        }catch (SQLException e){
            System.out.println(e);
            System.out.println("Either your driver is wrong or incorrect syntax");
        }finally{
            try {
                con.close();
            }catch (SQLException e){

            }
        }

    }
}