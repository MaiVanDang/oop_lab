package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:/Users/Admin/OneDrive - Hanoi University of Science and Technology/Desktop/oop_lab/OtherProject/src/hust/soict/globalict/garbage/test.txt"; // Replace with the path to an executable file
        byte[] inputBytes;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            String outputString = ""; // Start with an empty string

            for (byte b : inputBytes) {
                outputString += (char) b; // Inefficient concatenation
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken (GarbageCreator): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
