import java.util.*;

public class p02467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + ": ");
        List<Integer> res = primeFactorization(n);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i!= res.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static List<Integer> primeFactorization(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 2) {
            res.add(n);
            return res;
        }

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