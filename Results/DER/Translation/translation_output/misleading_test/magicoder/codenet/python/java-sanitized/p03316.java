import java.util.Scanner;

public class p03316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sn = 0;
        while (n != 0) {
            sn += n % 10;
            n /= 10;
        }

        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}