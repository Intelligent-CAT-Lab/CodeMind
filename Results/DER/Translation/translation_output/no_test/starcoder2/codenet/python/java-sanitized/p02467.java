import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + ": ");
        for (int i : prime_factorization(n)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static List<Integer> prime_factorization(int n) {
        List<Integer> res = new ArrayList<>();
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        return res;
    }
}

/docs/01-introduction/01-introduction.md
# Introduction