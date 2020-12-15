package server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class PServeice {
    public static void main(String args[]) throws Exception {
        @SuppressWarnings("resource")
        ServerSocket Server = new ServerSocket(8080, 10000, InetAddress.getByName("127.0.0.1"));
        System.out.println("http server on port 8080");

        while (true) {
            Socket connected = Server.accept();
            if (connected != null)
                (new http.HttpServer(connected)).start();
        }
    }
}
