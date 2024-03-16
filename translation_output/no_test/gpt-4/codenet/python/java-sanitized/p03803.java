import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p03803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers separated by a space
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Create a map to represent the priority of cards
        Map<Integer, Integer> priority = new HashMap<>();
        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
        for (int i = 0; i < j.length; i++) {
            priority.put(j[i], i);
        }
        
        // Compare the priority values of a and b
        if (priority.get(a) > priority.get(b)) {
            System.out.println("Alice");
        } else if (priority.get(a) < priority.get(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }

        // Close the scanner
        scanner.close();
    }
}