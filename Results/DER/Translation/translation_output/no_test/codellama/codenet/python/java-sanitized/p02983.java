import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l[i - L] = (i * j) % 2019;
                }
            }
            System.out.println(min(l));
        }
    }
}