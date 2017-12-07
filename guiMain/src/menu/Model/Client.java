package menu.Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client code for connecting to server side.
 * @author richardcastillo
 *
 */
public class Client {

    public Client(String data) throws IOException {
        System.out.println(data);
        Socket sock = new Socket("127.0.0.1", 9090);				// Creating a new socket object and setting IP & socket
        OutputStream ostream = sock.getOutputStream();			// Creating a OutputStream object
        PrintWriter out = new PrintWriter(ostream, true);		// Converts characters to bytes
        out.println(data);										
    }
}
