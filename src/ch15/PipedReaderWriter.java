package ch15;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class PipedReaderWriter {
    public static void main(String[] args) throws IOException {
        InputThread inputThread = new InputThread("InputThread");
        OutputThread outputThread = new OutputThread("OutputThread");

        // PipedReader와 PipedWriter를 연결한다.
        inputThread.connect(outputThread.getOutput());

        inputThread.start();
        outputThread.start();
    }
}

class InputThread extends Thread {
    PipedReader input = new PipedReader();
    StringWriter sw = new StringWriter();

    InputThread(String name) {
        super(name);
    }

    public void run() {
        try {
            int data = 0;

            while ((data = input.read()) != -1) {
                sw.write(data);
            }
            System.out.println(getName() + " received: " + sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedReader getInput() {
        return input;
    }

    public void connect(PipedWriter output) throws IOException {
        input.connect(output);
    }
}

class OutputThread extends Thread {
    PipedWriter output = new PipedWriter();

    OutputThread(String name) {
        super(name);
    }

    public void run() {
        try {
            String msg = "Hello";
            System.out.println(getName() + " sent: " + msg);
            output.write(msg);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PipedWriter getOutput() {
        return output;
    }

    public void connect(PipedReader input) throws IOException {
        output.connect(input);
    }
}

