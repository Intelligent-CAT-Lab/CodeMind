import java.util.Scanner;

public class p03281 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            int divisorCount = countDivisor(j);
            if (divisorCount == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static int countDivisor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}