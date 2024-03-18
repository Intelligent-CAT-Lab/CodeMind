import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Replace each character of the input string with 'x'
        for (int i = 0; i < s.length(); i++) {
            result.append('x');
        }
        
        // Print the result
        System.out.println(result.toString());
        
        scanner.close();
    }
}