package study;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        BufferedInputStream bis = new BufferedInputStream(is, 8192);

        byte[] buffer = new byte[3];
        int len, idx = 0;
        byte[] bytes = new byte[2];
        int bytesSize = 0;

        loop: while ((len = bis.read(buffer)) != -1) {
            for (int i = 0; i < len; i++) {
                if (buffer[i] == (byte) 'q') {
                    String result = new String(bytes, 0, idx, StandardCharsets.UTF_8);
                    System.out.println(result);
                    break loop;
                } else {
                    bytes[idx++] = buffer[i];
                    bytesSize++;
                }

                if (bytesSize == bytes.length) {
                    byte[] newBytes = new byte[bytes.length * 2];
                    for (int j = 0; j < bytes.length; j++) {
                        newBytes[j] = bytes[j];
                    }

                    bytes = newBytes;
                }

            }
        }
    }
}
