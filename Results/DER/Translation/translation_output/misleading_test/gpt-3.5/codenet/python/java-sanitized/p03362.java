import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
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

        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        if (n >= 2) {
            primeNums.add(2);
        }

        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNums) {
                if (p >= (int) Math.sqrt(i) + 1) {
                    primeNums.add(i);
                    break;
                }
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return primeNums;
    }
}