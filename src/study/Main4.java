package study;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main4 {
    public static void main(String[] args) throws IOException {
        String s = "건열a";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(b);
        byte[] buffer = new byte[3];
        int len;

        while((len = is.read(buffer)) != -1) {
            String result = new String(buffer, 0, len, StandardCharsets.UTF_8);
            System.out.println(result);
        }
    }
}
