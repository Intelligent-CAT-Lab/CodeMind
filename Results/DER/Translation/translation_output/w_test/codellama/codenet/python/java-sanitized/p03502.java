import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += (n % 10);
            n /= 10;
        }
        if (num == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}