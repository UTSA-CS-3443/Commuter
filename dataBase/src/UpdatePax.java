import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.System.out;

public class UpdatePax {

    //  connect database.
    private Connection connect() {

        String url = "jdbc:sqlite:main.db";
        Connection conn = null;


        try {
            Properties info = new Properties( );
            info.put( "", "" );
            info.put( "", "" );
            conn = DriverManager.getConnection(url);
            System.out.println(conn);
        } catch (SQLException e) {
            out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * param args the command line arguments
     */


    public static void main(String[] args) {
        //char d = 'd';
        UpdatePax app = new UpdatePax();
         //while loop to take in parameters

        app.updatePax(198, 1400, 30, 43, 5, 3);

    }

    private void updatePax(int studentId, int hour, int min, int route, int stop, int offset) {


        String sql = "UPDATE studPax SET hour = ? , "
                + "min = ?, "
                + "route = ?, "
                + "stop = ?, "
                + "offset = ? "
                + "WHERE studentId = 1";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            //set the corresponding param
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, hour);
            pstmt.setInt(3, min);
            pstmt.setInt(4, route);
            pstmt.setInt(5, stop);

            //update
            pstmt.execute();
        } catch (SQLException e) {
            out.println(e.getMessage());
        }

    }
}
