import java.util.Scanner;

public class p03265 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, s, d, f;
        a = scanner.nextInt();
        s = scanner.nextInt();
        d = scanner.nextInt();
        f = scanner.nextInt();
        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}