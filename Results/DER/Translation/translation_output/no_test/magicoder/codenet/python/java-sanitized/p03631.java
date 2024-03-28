import java.util.Scanner;

public class p03631 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = n / 100;
        int j = n % 10;
        if (i == j) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}