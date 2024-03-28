import java.util.Scanner;

public class p02903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, w, a, b;
        h = sc.nextInt();
        w = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(repeat("0", a) + repeat("1", w - a));
            } else {
                System.out.println(repeat("1", a) + repeat("0", w - a));
            }
        }
    }

    private static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}