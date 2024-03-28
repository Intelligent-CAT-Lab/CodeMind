import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a string input
        String s = scanner.nextLine();
        
        // Iterate over the characters in the string and print 'x'
        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
        
        scanner.close();
    }
}

// Test input:
// sardine
// Expected output:
// xxxxxxx