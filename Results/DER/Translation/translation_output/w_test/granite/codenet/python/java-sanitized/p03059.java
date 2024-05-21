import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int result = (t / a) * b;
        System.out.println(result);
    }
}