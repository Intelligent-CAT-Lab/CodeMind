import java.util.Scanner;

public class p02999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = 0;
        if (a < b) {
            result = 10;
        }

        System.out.println(result);
    }
}