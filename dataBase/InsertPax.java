import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import static java.lang.System.out;
import java.util.Properties;


public class InsertPax {

    //  connect database.
    private Connection connect() {

        //connection string
        String url = "jdbc:sqlite:main.db";
        Connection conn = null;


            try {
               // Properties info = new Properties();
                //info.put( "", "" );
                //info.put( "", "" );
                conn = DriverManager.getConnection(url);
                System.out.println(conn);
            } catch (SQLException e) {
                out.println(e.getMessage());
            }
        return conn;
    }

    public void insert( int hour, int min, int route,int stop,int offset) {
        String sql = "INSERT INTO studPax( hour, min, route, stop, offset) VALUES(?,?,?,?,?)";

        try {
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
           // pstmt.setInt(1, studentId);
            pstmt.setInt(1, hour);
            pstmt.setInt(2, min);
            pstmt.setInt(3, route);
            pstmt.setInt(4, stop);
            pstmt.setInt(5, offset);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        InsertPax app = new InsertPax();
        //insert two new rows

        app.insert(1000, 1200, 15, 43,5);
        app.insert(2000, 1230, 9,42,1);
    }

}

