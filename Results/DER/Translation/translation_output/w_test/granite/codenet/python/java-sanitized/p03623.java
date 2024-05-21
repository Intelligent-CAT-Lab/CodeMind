import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        char result = 'A';
        if (Math.abs(x - a) > Math.abs(x - b)) {
            result = 'B';
        }

        System.out.println(result);
    }
}