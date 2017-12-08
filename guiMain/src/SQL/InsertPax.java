<<<<<<< HEAD
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPax {

    //  connect database.
    private Connection connect() {

        //connection string
        String url = "192.168.86.117";
        Connection conn = null;


        try {
            // Properties info = new Properties();
            //info.put( "", "" );
            //info.put( "", "" );
            conn = DriverManager.getConnection(url);
            System.out.println(conn);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(int studentId, int hour, int min, int route, int stop, int offset) {
        String sql = "INSERT INTO studPax(studentId, hour, min, route, stop, offset) VALUES(?,?,?,?,?,?)";

        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, hour);
            pstmt.setInt(3, min);
            pstmt.setInt(4, route);
            pstmt.setInt(5, stop);
            pstmt.setInt(6, offset);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
=======
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPax {

    //  connect database.
    private Connection connect() {

        //connection string
        String url = "192.168.86.117";
        Connection conn = null;


        try {
            // Properties info = new Properties();
            //info.put( "", "" );
            //info.put( "", "" );
            conn = DriverManager.getConnection(url);
            System.out.println(conn);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(int studentId, int hour, int min, int route, int stop, int offset) {
        String sql = "INSERT INTO studPax(studentId, hour, min, route, stop, offset) VALUES(?,?,?,?,?,?)";

        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, hour);
            pstmt.setInt(3, min);
            pstmt.setInt(4, route);
            pstmt.setInt(5, stop);
            pstmt.setInt(6, offset);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
>>>>>>> 3d23d977f5da8e3e2052b71db2f70d30276b5dfc
}