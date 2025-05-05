import java.io.*;
class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("input.txt")) {
            int data;
            while ((data = input.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}