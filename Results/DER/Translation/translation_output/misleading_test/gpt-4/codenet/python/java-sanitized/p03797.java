import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading space-separated input
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (s * 2 <= c) {
            // Printing the result of the first branch of the conditional
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            // Printing the result of the else branch
            System.out.println(c / 2);
        }

        scanner.close();
    }
}