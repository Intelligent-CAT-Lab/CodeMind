import java.util.Scanner;

public class p03815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x / 11;
        x = x - 11 * n;
        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}