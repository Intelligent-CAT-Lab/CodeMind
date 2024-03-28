import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, a, b;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        a = x2 - x1;
        b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}