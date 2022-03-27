package study;

import java.io.*;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        // 채팅 입력값을 받음
        InputStream is = System.in;
        BufferedInputStream bis = new BufferedInputStream(is, 8192);

        // 마지막에 q 입력시 파일에 저장 후 종료
        int len;
        byte[] buffer = new byte[3];
        OutputStream os = new FileOutputStream("src/study/result");
        BufferedOutputStream bos = new BufferedOutputStream(os, 8192);

        loop: while ((len = bis.read(buffer)) != -1) {
            for (int i = 0; i < len; i++) {
                if (buffer[i] == (byte) 'q') {
                    bos.write(buffer, 0, i);
                    break loop;
                }
            }
            bos.write(buffer, 0, len);
        }

        bos.flush();
        bos.close();

        // 파일을 읽기
        InputStream inputStream = new FileInputStream("src/study/result");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        InputStreamReader isr = new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8);

        char[] cBuffer = new char[2];
        StringBuilder sb = new StringBuilder();

        // 콘솔에 출력
        while ((len = isr.read(cBuffer)) != -1) {
            sb.append(cBuffer, 0, len);
        }

        System.out.println(sb.toString());
    }
}
