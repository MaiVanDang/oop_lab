package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "C:/Users/Admin/OneDrive - Hanoi University of Science and Technology/Desktop/oop_lab/OtherProject/src/hust/soict/globalict/garbage/test.txt"; // Replace with the path to an executable file
        byte[] inputBytes;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            StringBuilder outputString = new StringBuilder(); // Use StringBuilder

            for (byte b : inputBytes) {
                outputString.append((char) b); // Efficient appending
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken (NoGarbage): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}