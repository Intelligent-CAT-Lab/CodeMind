import java.util.Scanner;

public class p03587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        String s = scanner.nextLine();

        // Count the occurrences of '1' in the string
        int onesCount = countOccurrences(s, '1');

        // Print the result
        System.out.println(onesCount);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrences of a character in a string
    private static int countOccurrences(String str, char toFind) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toFind) {
                count++;
            }
        }
        return count;
    }
}