import java.util.Scanner;

public class p02945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(a - b, Math.max(a + b, a * b)));
    }
}