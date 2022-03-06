package study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class socketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("연결 전");
        Socket socket = serverSocket.accept();
        System.out.println("연결 후");

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
        char[] cBuffer = new char[3];
        int len;

        Thread thread = new Thread(() -> {
            try {
                InputStream inputStream = System.in;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
                InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8);
                char[] buffer = new char[2];
                int inputStrLen;

                while ((inputStrLen = inputStreamReader.read(buffer)) != -1) {
                    String inputStr = new String(buffer, 0, inputStrLen);
                    OutputStream os = socket.getOutputStream();
                    os.write(inputStr.getBytes(StandardCharsets.UTF_8));
                    System.out.println("소켓의 outputStream 획득");
//                    os.close();
                }

                System.out.println("outputStream 종료");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();

        System.out.println("while문 시작");
        while ((len = isr.read(cBuffer)) != -1) {
            String result = new String(cBuffer, 0, len);
            System.out.println(result);
        }
        System.out.println("while문 끝");
    }
}
