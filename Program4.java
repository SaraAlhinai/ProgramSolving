//( Problem 4 ): 

import java.util.ArrayList;
import java.util.Scanner;

public class EvenIntegerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Prompt the user to enter integers
        System.out.println("Enter integers (enter any non-integer to stop):");
        
        // Read integers from user input
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        
        // Print even integers
        System.out.println("Even integers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        
        scanner.close();
    }
}



