package neros2k.httpserver;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class HttpServer {
    public static void main(String[] ARGS) throws Throwable {
        ServerSocket SERVER_SOCKET = new ServerSocket(8080);
        ScheduledExecutorService EXECUTOR = Executors.newScheduledThreadPool(1);
        EXECUTOR.scheduleAtFixedRate(
                () -> new Thread() {
                    Socket SOCKET = null;
                    OutputStream OUTPUT_STREAM = null;
                    {
                        try {
                            SOCKET = SERVER_SOCKET.accept();
                            OUTPUT_STREAM = SOCKET.getOutputStream();
                        } catch(IOException EXCEPTION) { EXCEPTION.printStackTrace(); }
                    }
                    @Override
                    public void run() {
                        try {
                            String HTML_STR = "Go ERP";
                            String RESPONSE = "HTTP/1.1 200 OK\r\n" +
                                    "Server: SexDrochilnya/988-28-07\r\n" +
                                    "Content-Type: text/html\r\n" +
                                    "Content-Length: " + HTML_STR.length() + "\r\n" +
                                    "Connection: close\r\n\r\n";
                            String RESULT = RESPONSE + HTML_STR;
                            OUTPUT_STREAM.write(RESULT.getBytes());
                            OUTPUT_STREAM.flush();
                        } catch(Throwable ignored) {} finally {
                            try {
                                SOCKET.close();
                            } catch(Throwable ignored) {}
                        }
                    }
                }.start(), 0, 1, TimeUnit.NANOSECONDS
        );
    }
}
