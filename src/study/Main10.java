package study;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main10 {
    public static void main(String[] args) throws IOException {
        String s = "건열";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        ByteArrayOutputStream os = new ByteArrayOutputStream(3);
        os.write(b);

        byte[] data = os.toByteArray();
        String result = new String(data, StandardCharsets.UTF_8);
        System.out.println(result);
    }
}
