import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDivisors(n));
    }

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int divisorCount = countDivisors(i);
            sum += divisorCount * i;
        }
        return sum;
    }

    public static int countDivisors(int n) {
        int count = 1;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        for (int p = 3; p * p <= n; p += 2) {
            int count2 = 1;
            while (n % p == 0) {
                n /= p;
                count2++;
            }
            count *= count2;
        }
        if (n > 1) {
            count *= 2;
        }
        return count;
    }
}