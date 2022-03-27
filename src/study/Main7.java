package study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Main7 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        System.out.println("[입력 스트림 획득]");
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        char[] cBuffer = new char[2];
        int len;

        Thread thread = new Thread(() -> {
            try {
                OutputStream os = socket.getOutputStream();
                System.out.println("[출력 스트림 획득]");
                BufferedOutputStream bos = new BufferedOutputStream(os, 8192);

                InputStream inputStream = System.in;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);

                byte[] buffer = new byte[3];
                int bufferLen;
                while ((bufferLen = bufferedInputStream.read(buffer)) != -1) {
                    bos.write(buffer, 0, bufferLen);
                    bos.flush();
                    System.out.println("flush 완료");
                }
//                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        while ((len = isr.read(cBuffer)) != -1) {
            String s = new String(cBuffer, 0, len);
            System.out.print(s);
        }
    }
}
