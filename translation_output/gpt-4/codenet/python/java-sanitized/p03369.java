import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read a string input from the user
        String s = scanner.nextLine();
        
        // Count the occurrences of "o" in the input string
        long countO = s.chars().filter(ch -> ch == 'o').count();
        
        // Calculate the result based on the count of "o"
        int result = 700 + (int) (100 * countO);
        
        // Print the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}