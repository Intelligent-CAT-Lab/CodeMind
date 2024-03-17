import java.util.*;

public class p03362 {
    static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        primeNums.add(2);
        for (int i = 3; i <= n; i++) {
            for (int p : primeNums) {
                if (p >= Math.sqrt(i) + 1) {
                    primeNums.add(i);
                    break;
                }
                if (i % p == 0) {
                    break;
                }
            }
        }
        return primeNums;
    }

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

        System.out.println(ans.stream().mapToInt(i -> i).toArray());
    }
}