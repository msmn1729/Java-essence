package study;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main4 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStream bis = new BufferedInputStream(is, 8192);
        byte[] buffer = new byte[3];
        int len;

        while ((len = bis.read(buffer)) != -1) {
            String result = new String(buffer, 0, len, StandardCharsets.UTF_8);
            System.out.println(result);
        }
    }
}
