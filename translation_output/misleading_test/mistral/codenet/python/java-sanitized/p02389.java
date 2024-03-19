import java.util.Scanner;

public class p02389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result1 = a * b;
        int result2 = (a + b) * 2;
        System.out.println(result1 + " " + result2);
    }
}