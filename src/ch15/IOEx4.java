package ch15;

import java.io.*;
import java.util.Arrays;

public class IOEx4 {
    public static void main(String[] args) throws IOException {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        InputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        while (input.available() > 0) {
            int len = input.read(temp); // input이라는 입력스트림에서 읽은 바이트의 개수를 len에 저장
            output.write(temp, 0, len);
        }
        outSrc = output.toByteArray();
        System.out.println("Input Source: " + Arrays.toString(inSrc));
        System.out.println("temp: " + Arrays.toString(temp));
        System.out.println("Output Source: " + Arrays.toString(outSrc));
    }
}
