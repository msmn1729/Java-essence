package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main9 {
    public static void main(String[] args) throws IOException {
        // 1. 바이트배열이 왜 단점인지?, 2. 어떻게 코딩?(char배열과 완전 무관), 3. 어떤 클래스를 사용?
        String s = "건a열";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(b);
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
        char[] cBuffer = new char[2];

        int len;
        while ((len = isr.read(cBuffer)) != -1) {
            String result = new String(cBuffer, 0, len);
            System.out.println(result);
        }
    }
}
