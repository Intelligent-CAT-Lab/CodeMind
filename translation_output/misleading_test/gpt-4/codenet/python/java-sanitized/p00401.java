import java.util.Scanner;

public class p00401 {
    public static void main(String[] args) {
        // Sample test case
        // Test input: 54
        // Expected output: 33

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println((int) Math.round((double) count / 2));
    }
}