import java.util.Scanner;

public class p00957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(rec(l, k, true));
    }

    public static int rec(int i, int k, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;  // black at bottom
        if (isBlack) { // top is black
            return rec(i - 1, k, false) + rec(i - k, k, false);
        } else {  // top is white
            return rec(i - 1, k, true) + rec(i - k, k, true);
        }
    }
}