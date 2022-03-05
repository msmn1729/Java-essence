package ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("123.txt");
        // BufferedOutputStream의 버퍼 크기를 5로 한다.
        BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
        // 파일 123.txt에 1부터 9까지 숫자를 저장 한다.
        for (int i = '1'; i <= '9'; i++) {
            bos.write(i);
        }
//        fos.close(); // 1~5까지만 저장
        bos.close(); // 1~9까지 저장됨 -> 보조스트림의 close()를 호출해야 버퍼에 남아있는 데이터까지 출력된다.
    }
}
