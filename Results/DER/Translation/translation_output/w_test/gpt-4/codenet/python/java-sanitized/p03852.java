import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: "); // Assuming the input will be a single character
        String x = scanner.next().toLowerCase(); // Read input and convert to lower case for comparison

        if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();
    }
}