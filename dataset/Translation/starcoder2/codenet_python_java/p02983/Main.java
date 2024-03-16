import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = 0; i < l.length; i++) {
                l[i] = (L + i) * (L + i + 1) % 2019;
            }
            int min = l[0];
            for (int i = 1; i < l.length; i++) {
                if (l[i] < min) {
                    min = l[i];
                }
            }
            System.out.println(min);
        }
    }
}