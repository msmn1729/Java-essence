package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main11 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String s = "건열";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);

        OutputStream os = System.out;
        BufferedOutputStream bos = new BufferedOutputStream(os, 8192);
        bos.write(b);
//        bos.flush();
        bos.close();
//        Thread.sleep(10000);

//        InputStream is = new FileInputStream("test.txt");
//        BufferedInputStream bis = new BufferedInputStream(is, 8192);
//        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
//
//        int len;
//        char[] cBuffer = new char[2];
//        while ((len = isr.read(cBuffer)) != -1) {
//            String result = new String(cBuffer, 0, len);
//            System.out.println(result);
//        }
    }
}
