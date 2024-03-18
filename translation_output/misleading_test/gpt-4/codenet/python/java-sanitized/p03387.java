import java.util.Scanner;

public class p03387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = Math.max(Math.max(a, b), c);
        int y = Math.min(Math.min(a, b), c);
        int z = a + b + c - x - y;
        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }
        scanner.close();
    }
}