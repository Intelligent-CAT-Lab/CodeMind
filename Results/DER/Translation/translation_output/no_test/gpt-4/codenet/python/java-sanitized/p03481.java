import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by a space
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculating the division and finding the bit length of the result
        int division = Y / X;
        int k = Integer.SIZE - Integer.numberOfLeadingZeros(division);

        // Printing the result
        System.out.println(k);
        
        scanner.close();
    }
}