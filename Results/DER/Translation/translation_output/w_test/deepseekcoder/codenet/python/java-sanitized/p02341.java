import java.util.Scanner;

public class p02341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n <= k) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}