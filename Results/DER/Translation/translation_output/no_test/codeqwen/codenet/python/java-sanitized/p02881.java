import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = (int) Math.sqrt(n);
        while (i > 0) {
            if (n % i == 0) {
                System.out.println(i + " " + n / i);
                break;
            }
            i--;
        }

        int sum = i + n / i - 2;
        System.out.println(sum);
    }
}