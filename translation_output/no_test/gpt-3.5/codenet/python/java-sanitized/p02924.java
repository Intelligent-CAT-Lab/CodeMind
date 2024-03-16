import java.util.Scanner;

public class p02924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = (n-1) * n / 2;
        System.out.println(sum);
    }
}