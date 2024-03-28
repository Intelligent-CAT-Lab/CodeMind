import java.util.*;

public class p03362 {
    static int[] makePrimeNums(int n) {
        int[] primeNums = new int[n + 1];
        Arrays.fill(primeNums, 2);
        for (int i = 3; i <= n; i++) {
            for (int p : primeNums) {
                if (p >= Math.sqrt(i) + 1) {
                    primeNums[i] = p;
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
        int[] p = makePrimeNums(2000);

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