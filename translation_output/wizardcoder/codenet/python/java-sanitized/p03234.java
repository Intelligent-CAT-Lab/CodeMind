import java.util.*;

public class p03234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int k = sc.nextInt();
        int n = 2*nn;
        List<int[]> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        List<Integer> flattenabli = new ArrayList<>();
        for (int[] ab : abli) {
            flattenabli.add(ab[0]);
            flattenabli.add(ab[1]);
        }
        int cut = 1000000007;

        List<Integer> unused = new ArrayList<>(Collections.nCopies(n+1, 1));
        for (int a : flattenabli) {
            unused.set(a, unused.get(a)-1);
        }
        List<Integer> unusedacum = new ArrayList<>(Collections.nCopies(n+1, 0));
        for (int i = 1; i <= n; i++) {
            unusedacum.set(i, unusedacum.get(i-1)+unused.get(i));
        }

        int modInverse(int a, int b) {
            int r0 = a, r1 = b, s0 = 1, s1 = 0;
            while (r1!= 0) {
                int q = r0 / r1;
                int stmp = s0 - q * s1;
                r0 = r1;
                s0 = s1;
                r1 = r0 % r1;
                s1 = stmp;
            }
            return s0 % cut;
        }

        Map<Integer, Integer> doubleFactorial = new HashMap<>();
        for (int i = 1; i <= n; i+=2) {
            doubleFactorial.put(i, 1);
        }
        for (int i = 3; i <= n; i+=2) {
            doubleFactorial.put(i, (doubleFactorial.get(i-2)*i) % cut);
        }

        List<List<Integer>> nonSandwichedNums = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums.get(i).add(j);
                }
            }
        }

        int numberUnderterminedBetween(int i, int j) {
            return unusedacum.get(j) - unusedacum.get(i-1);
        }

        int pairCombinations(int x) {
            if (x == 0) {
                return 1;
            } else if (x % 2 == 0) {
                return doubleFactorial.get(x-1);
            } else {
                return 0;
            }
        }

        int g(int i, int j) {
            int x = numberUnderterminedBetween(i, j);
            return pairCombinations(x);
        }

        int undetermined = numberUnderterminedBetween(1, n);

        List<List<Integer>> ggg = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            List<Integer> gg = new ArrayList<>();
            for (int j = i+1; j <= n; j++) {
                gg.add(g(i, j));
            }
            ggg.add(gg);
        }

        int ans = 0;
        List<List<Integer>> dp = new ArrayList<>(Collections.nCopies(n+1, new ArrayList<>()));
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = i+1; j <= n; j++) {
                int gg = ggg.get(i).get(j-i);
                if (gg!= 0) {
                    int sum = 0;
                    for (int kk : nonSandwichedNums.get(i)) {
                        if (kk < j) {
                            sum = (sum + dp.get(i).get(kk-i)*ggg.get(kk-i+1).get(j-i)) % cut;
                        }
                    }
                    dp.get(i).set(j-i, (ggg.get(i).get(j-i)-sum) % cut);
                } else {
                    dp.get(i).set(j-i, 0);
                }
                ans = (ans + dp.get(i).get(j-i)*pairCombinations(undetermined-numberUnderterminedBetween(i, j))) % cut;
            }