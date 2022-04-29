package neros2k.tcpserver;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class TcpServer {
    public static void main(String[] ARGS) throws IOException {
	ServerSocket SERVER_SOCKET = new ServerSocket(50001);
        Scanner CONSOLE_SCANNER = new Scanner(System.in);
        Socket SOCKET = null;
        while(true) {
            switch(CONSOLE_SCANNER.next()) {
                case "start" -> {
                    SOCKET = SERVER_SOCKET.accept();
                }
                case "send" -> {
                    if(SOCKET != null) {
                        DataOutputStream DATA_OUTPUT_STREAM = new DataOutputStream(SOCKET.getOutputStream());
                        DATA_OUTPUT_STREAM.writeBytes("go erp");
                        DATA_OUTPUT_STREAM.close();
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
