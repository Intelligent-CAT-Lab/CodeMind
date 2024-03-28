import java.util.Scanner;

public class p03920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}