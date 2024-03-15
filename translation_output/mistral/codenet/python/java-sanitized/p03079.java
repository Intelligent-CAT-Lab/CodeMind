import java.util.Scanner;

public class p03079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}