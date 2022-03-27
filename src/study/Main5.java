package study;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main5 {
    public static void main(String[] args) throws IOException {
        String s = "건열a";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(bytes);
        int len;
        byte[] buffer = new byte[3];

        while ((len = is.read(buffer)) != -1) {
            String result = new String(buffer, 0, len, StandardCharsets.UTF_8);
            System.out.println(result);
        }
    }
}
