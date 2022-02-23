package study;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] b = "건열경수".getBytes(StandardCharsets.UTF_8);
        InputStream inputStream = new ByteArrayInputStream(b);
        byte[] buffer = new byte[3];
//        int len = inputStream.read(buffer);
        InputStream bis = new BufferedInputStream(inputStream, 8192);

        int len = 0;
        String s;
//        String s = new String(buffer, 0, len, StandardCharsets.UTF_8);
//        System.out.println(s);
//        System.out.println(len);
//
//        buffer = new byte[3];
//        len = inputStream.read(buffer);
//
//        s = new String(buffer, 0, len, StandardCharsets.UTF_8);
//        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();

        while((len = bis.read(buffer)) != -1) {
            s = new String(buffer, 0, len, StandardCharsets.UTF_8);
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder);
    }
}
