package neros2k.tcpclient;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class TcpClient {
    public static void main(String[] ARGS) throws IOException {
        Scanner CONSOLE_SCANNER = new Scanner(System.in);
        Socket SOCKET = null;
        while(true) {
            switch(CONSOLE_SCANNER.next()) {
                case "start" -> {
                    SOCKET = new Socket("localhost", 50001);
                }
                case "read" -> {
                    if(SOCKET != null) {
                        InputStream INPUT_STREAM = SOCKET.getInputStream();
                        BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(INPUT_STREAM));
                        String DATA = BUFFERED_READER.readLine();
                        System.out.println("Прочитано: " + DATA);
                    }
                }
                case "close" -> {
                    if(SOCKET != null) {
                        SOCKET.close();
                        return;
                    }
                }
            }
        }

    }
}