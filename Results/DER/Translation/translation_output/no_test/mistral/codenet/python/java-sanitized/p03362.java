import java.util.*;

public class p03362 {
    static int INF = (int) 1e16;
    static int MOD = (int) 1e9 + 7;

    static int ni(String input) {
        return Integer.parseInt(input);
    }

    static int[] ns(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static List<Integer> na(String input) {
        return Arrays.stream(input.split(" ")).map(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    static List<Integer> na1(String input) {
        List<Integer> result = new ArrayList<>();
        for (String s : input.split(" ")) {
            result.add(Integer.parseInt(s) - 1);
        }
        return result;
    }

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
        Scanner scanner = new Scanner(System.in);
        int n = ni();
        List<Integer> primeNums = makePrimeNums(2000);

        List<Integer> ans = new ArrayList<>();
        for (int pi : primeNums) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        System.out.println(ans.stream().mapToInt(Integer::intValue).toArray());
    }
}