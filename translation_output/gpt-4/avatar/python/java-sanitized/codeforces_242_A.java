import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input line and split it into tokens
        String[] tokens = scanner.nextLine().split(" ");
        
        // Parse the integers from the tokens
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        int a = Integer.parseInt(tokens[2]);
        int b = Integer.parseInt(tokens[3]);
        
        // Create a list to store the pairs (i, j)
        List<int[]> c = new ArrayList<>();
        
        // Generate the pairs and add them to the list if i > j
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c.add(new int[] {i, j});
                }
            }
        }
        
        // Print the number of pairs
        System.out.println(c.size());
        
        // Print each pair
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }
        
        // Close the scanner
        scanner.close();
    }
}