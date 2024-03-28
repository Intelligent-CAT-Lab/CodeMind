import java.util.Scanner;

public class p03359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}