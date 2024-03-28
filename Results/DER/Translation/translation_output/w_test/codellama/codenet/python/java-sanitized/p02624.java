import java.util.Scanner;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soFar = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            soFar += d * i;
            System.out.print(soFar + ",");
        }
        System.out.println();
    }

    public static int divCount(int n) {
        int total = 1;
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                int count = 0;
                while (n % p == 0) {
                    n /= p;
                    count++;
                }
                total *= (count + 1);
            }
        }
        if (n > 1) {
            total *= 2;
        }
        return total;
    }
}