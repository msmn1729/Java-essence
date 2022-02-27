package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main5 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/study/test");
        InputStream bis = new BufferedInputStream(is, 8192);
        // 바이트배열을 쓰면 안좋은 이유? InputStreamReader설명 빼고
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        char[] cBuffer = new char[2];
        int len;

        while ((len = isr.read(cBuffer)) != -1) {
            String result = new String(cBuffer, 0, len);
            System.out.println(result);
        }
    }
}
