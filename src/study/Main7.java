package study;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main7 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/study/test");
        InputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        int len, idx = 0;
        char[] cBuffer = new char[3]; // 캐릭터 배열의 사이즈와 무관하게 개행으로 구분 처리되어야함
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[3]; // 3줄로 되어있는 파일을 개행 기준으로 배열에 순서대로 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }

        while ((len = isr.read(cBuffer)) != -1) {
            int cLen = 0;
            for (int i = 0; i < cBuffer.length; i++) {
                if (cBuffer[i] == '\n') {
                    idx++;
                }
                else {
                    cLen++; // cLen = i + 1;로 해도 동일
                    arr[idx] += cBuffer[i];
                }
            }
//            sb.append(cBuffer, 0, cLen);
//            arr[idx] = new String(cBuffer, 0, cLen);
            if(cLen != len) {
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
