package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) throws IOException {
        String s = "건a열";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(b);
        byte[] buffer = new byte[3];
        BufferedInputStream bis = new BufferedInputStream(is, 8192); // JVM 버퍼의 크기를 적절하게 맞춰서 I/O 성능 향상
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
        char[] cBuf = new char[2];
        int len;

        while ((len = isr.read(cBuf)) != -1) {
            String result = new String(cBuf, 0, len);
            System.out.println(result);
        }
    }
}
