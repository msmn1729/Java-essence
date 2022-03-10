package ch15;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("sample.dat");
        dos = new DataOutputStream(fos);
        dos.writeInt(10);
        dos.writeFloat(20.0f);
        dos.writeBoolean(true);

        dos.close();
    }
}
