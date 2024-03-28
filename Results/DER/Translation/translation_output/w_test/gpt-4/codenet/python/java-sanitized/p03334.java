import java.util.Scanner;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();

        Judge j1 = judge(D1);
        Judge j2 = judge(D2);

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j