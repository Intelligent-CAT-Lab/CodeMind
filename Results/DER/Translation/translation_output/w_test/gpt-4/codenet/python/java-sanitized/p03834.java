import java.util.Scanner;

public class p03834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Read input line
        s = s.replace(",", " "); // Replace commas with spaces
        System.out.println(s); // Print the result
        scanner.close(); // Close the scanner
    }
}