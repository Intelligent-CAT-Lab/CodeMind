import java.util.*;

class DSumOfDivisors {
    public static int solve(int tc) {
        // def divCount(n):
        // 
        //     # sieve method for
        //     # prime calculation
        //     int[] hh = new int[n + 1];
        // 
        //     int p = 2;
        //     while ((p * p) < n) {
        //         if (hh[p] == 0) {
        //             for (int i = p * 2; i <= n; i += p) {
        //                 hh[i] = 0;
        //             }
        //         }
        //         p++;
        // 
        //         // Traversing through
        //     // all prime numbers
        //     int total = 1;
        //     for (int p = 2; p <= n; p++) {
        //         if (hh[p] == 0) {
        // 
        //             // calculate number of divisor
        //             // with formula total div =
        //             // (p1+1) * (p2+1) *.....* (pn+1)
        //             // where n = (a1^p1)*(a2^p2)....
        //             // *(an^pn) ai being prime divisor
        //             // for n and pi are their respective
        //             // power in factorization
        //             int count = 0;
        //             if (n % p == 0) {
        //                 while (n % p == 0) {
        //                     n /= p;
        //                     count++;
        //                 }
        //                 total *= (count + 1);
        //             }
        // 
        //     }
        // 
        //     return total;
        // 
        // so_far = 0
        // for (int i = 1; i < 10; i++) {
        //     int d = divCount(i);
        //     so_far += d * i;
        //     System.out.print(so_far + ", ");
        // }

        int n = Integer.parseInt(input());

        return (int) Arrays.stream(new int[n + 1]).parallel().filter(i -> i != 0).mapToInt(i -> (i + 1) * (i + 2) * ... * ((n + 1) / i + 1)).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tc; i++) {
            solve(i);
        }
    }
}