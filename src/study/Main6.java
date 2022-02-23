package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main6 {
    public static void main(String[] args) throws IOException {
        String s = "건a열";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(b);
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
        char[] cBuffer = new char[2];

        byte[] buffer = new byte[3];
        int len;

        while ((len = isr.read(cBuffer)) != -1) {
            String result = new String(cBuffer, 0, len);
            System.out.println(result);
        }

        isr.close();
    }
}
