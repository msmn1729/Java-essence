package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main6 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/study/tt");
        InputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        char[] cBuffer = new char[1];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = isr.read(cBuffer)) != -1) {
            stringBuilder.append(cBuffer, 0, len);
        }
        System.out.print(stringBuilder.toString());
    }
}
