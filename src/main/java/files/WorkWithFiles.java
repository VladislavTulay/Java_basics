package files;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class WorkWithFiles {

    public static void main(String[] args) {

        bufferRead();
        bufferWrite();
        fileStreamWrite();
        scannerAndWriter();

    }



    static void bufferRead() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void bufferWrite() {
        String outputFileName = "data/output2.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("0")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fileStreamWrite() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data/output3.txt");

            String greetings = "Blah blah blah";

            fileOutputStream.write(greetings.getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void scannerAndWriter() {
        Stack<String> stack = new Stack<>();
        try (Scanner scanner = new Scanner(new File("data/input.txt"));
             FileWriter writer = new FileWriter("data/output.txt")) {

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                stack.push(scanner.nextLine());
            }
            while (!stack.isEmpty()) writer.write(stack.pop() + "\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
