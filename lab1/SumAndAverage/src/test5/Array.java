package test5;
import java.util.Scanner;
public class Array {
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int check;
        do {
            check = 0;
            for (int i = 0; i < size - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    check++;
                }
            }
        } while (check != 0);
		
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
		double average = (double) sum / size ;
		
		System.out.println("Sorted array: ");
		for(int i = 0; i < size; i++) System.out.print(numbers[i] + " ");
        System.out.println("\nSum of elements: " + sum);
        System.out.println("Average value: " + average);
	}
}
