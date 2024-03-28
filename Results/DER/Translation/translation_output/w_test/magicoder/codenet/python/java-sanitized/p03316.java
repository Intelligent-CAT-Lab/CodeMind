import java.util.Scanner;

public class p03316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sn = 0;
        int temp = n;

        while (temp > 0) {
            sn += temp % 10;
            temp /= 10;
        }

        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}