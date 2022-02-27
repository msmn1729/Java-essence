package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/study/test");
        InputStream bis = new BufferedInputStream(is, 8192);
        byte[] buffer = new byte[3];
        int len;

        while ((len = bis.read(buffer)) != -1) {
            String result = new String(buffer, 0, len, StandardCharsets.UTF_8);
            System.out.println(result);
        }
    }
}
