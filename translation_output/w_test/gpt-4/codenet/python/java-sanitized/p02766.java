import java.util.Scanner;

public class p02766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        // Initialize the iterator
        int i = 0;

        // Calculate the highest power of k that divides n
        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        // Print the result
        System.out.println(i);
    }
}