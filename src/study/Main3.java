package study;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        int len;
        char[] cBuffer = new char[2];
        String result = "";

        loop: while ((len = isr.read(cBuffer)) != -1) {
            for (int i = 0; i < len; i++) {
                if (cBuffer[i] == 'q') {
                    System.out.println(result);
                    break loop;
                }
                else {
                    result += cBuffer[i];
                }
            }
        }
    }
}
