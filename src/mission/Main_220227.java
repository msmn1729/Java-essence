package mission;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main_220227 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/study/test");
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        char[] buffer = new char[2];
        int len, idx = 0;
        String[] arr = new String[3];
        StringBuilder sb = new StringBuilder();

        while ((len = isr.read(buffer)) != -1) {
            for (int i = 0; i < len; i++) {
                if(buffer[i] == '\n') {
                    // 개행문자일 때 sb에 저장되어있는 문자열을 배열에 저장
                    arr[idx++] = sb.toString();
                    sb.setLength(0); // sb 초기화
                }
                // 개행이 아닌 경우 sb에 추가
                else sb.append(buffer[i]);
            }
        }

        // 예외처리: 마지막 라인의 끝문자가 개행이 아닌 경우 sb에 값이 남아 있을 수 있음
        if (sb.length() > 0) {
            arr[idx++] = sb.toString();
        }

        // 문자열배열 출력
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
