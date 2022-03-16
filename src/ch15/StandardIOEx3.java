package ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = null;
        FileOutputStream fos = null;

        fos = new FileOutputStream("test.txt");
        ps = new PrintStream(fos);
        System.setOut(ps); // System.out의 출력 대상을 test.txt파일로 변경

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
