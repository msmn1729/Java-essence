package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String s = "건열a";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        OutputStream os = new FileOutputStream("src/study/test");
        BufferedOutputStream bos = new BufferedOutputStream(os, 8192);
        bos.write(bytes);
        bos.flush();
        bos.close();
    }
}
