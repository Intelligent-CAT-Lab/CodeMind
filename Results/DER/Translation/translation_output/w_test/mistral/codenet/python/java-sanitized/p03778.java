import java.util.Scanner;

public class p03778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w, a, b;
        w = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
    }
}