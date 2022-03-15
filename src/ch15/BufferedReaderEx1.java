package ch15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/ch15/BufferedReaderEx1.java");
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        for (int i = 1; (line = br.readLine()) != null; i++) {
            // ";"을 포함한 라인을 출력한다.
            if (line.contains(";")) {
                System.out.println(i + ": " + line);
            }
        }
    }
}
