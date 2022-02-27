package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String s = "할리스a";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        OutputStream os = new FileOutputStream("src/study/test");
        os.write(b);

        os.flush();
    }
}
