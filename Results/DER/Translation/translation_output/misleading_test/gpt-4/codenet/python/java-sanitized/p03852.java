import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String x = scanner.next().toLowerCase(); // Assuming we want to ignore case as Python is case-sensitive

        // We ensure that only the first character is checked even if the user enters more than one character
        char firstChar = x.charAt(0); 

        if (firstChar == 'a' || firstChar == 'i' || firstChar == 'u' || firstChar == 'e' || firstChar == 'o') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();
    }
}