package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String s = "건열a";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(bytes);
        BufferedInputStream bis = new BufferedInputStream(is, 8192);

        OutputStream os = new FileOutputStream("src/study/test2");
        BufferedOutputStream bos = new BufferedOutputStream(os, 8192);
        byte[] buffer = new byte[2];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.flush();
        bos.close();
    }
}
