import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = makePrimeNums(2000);
        List<Integer> ans = new ArrayList<>();
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }
        System.out.println(String.join(" ", ans.stream().map(String::valueOf).collect(Collectors.toList())));
    }

    public static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        primeNums.add(2);
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNums) {
                if (p >= (int) Math.sqrt(i) + 1) {
                    primeNums.add(i);
                    isPrime = false;
                    break;
                }
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNums.add(i);
            }
        }
        return primeNums;
    }
}