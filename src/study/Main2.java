package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String word = "건www\n열a";
        byte[] bWord = word.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(bWord);
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr, 8192);
        System.out.println(br.readLine());
        System.out.println(br.readLine());

        char[] cBuffer = new char[5];

//        byte[] buffer = new byte[3];
        int len = 0;

        while ((len = isr.read(cBuffer)) != -1) {
            String s = new String(cBuffer, 0, len);
            System.out.println(s);
        }
    }
}
