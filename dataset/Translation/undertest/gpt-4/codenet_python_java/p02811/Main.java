import java.util.Scanner;

public class p02811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        System.out.println(500 * K >= X ? "Yes" : "No");
        scanner.close();
    }
}