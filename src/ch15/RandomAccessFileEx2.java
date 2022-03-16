package ch15;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        int[] score = { 1, 100, 90, 90,
                        2, 70, 90, 100,
                        3, 100, 100, 100 };

        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
            for (int i = 0; i < score.length; i++) {
                raf.writeInt(score[i]);
            }
            // 파일포인터의 위치가 마지막으로 가있기 때문에 처음으로 이동
            raf.seek(0);
            while (true) {
                System.out.println(raf.readInt());
            }
        } catch (EOFException eofException) {
            // readInt() 호출시 더 이상 읽을 내용이 없을 때 EOFException 발생
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
