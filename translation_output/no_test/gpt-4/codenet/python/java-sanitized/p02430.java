import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        List<int[]> combs = generateCombinations(n, k);

        List<Pair> sumWithComb = new ArrayList<>();
        for (int[] comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumWithComb.add(new Pair(sum, comb));
        }

        Collections.sort(sumWithComb);

        for (Pair pair : sumWithComb) {
            System.out.println(pair.sum + ": " + Arrays.toString(pair.comb).replace("[", "").replace("]", "").replace(",", ""));
        }
    }

    private static List<int[]> generateCombinations(int n, int k) {
        List<int[]> combs = new ArrayList<>();
        int[] comb = new int[k];
        // Start the first combination
        for (int i = 0; i < k; i++) {
            comb[i] = i;
        }

        while (comb[k - 1] < n) {
            combs.add(comb.clone());

            // Move to the next combination
            int t = k - 1;
            while (t != 0 && comb[t] == n - k + t) {
                t--;
            }
            comb[t]++;
            for (int i = t + 1; i < k; i++) {
                comb[i] = comb[i - 1] + 1;
            }
        }

        return combs;
    }
    
    static class Pair implements Comparable<Pair> {
        int sum;
        int[] comb;

        Pair(int sum, int[] comb) {
            this.sum = sum;
            this.comb = comb;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.sum, other.sum);
        }
    }
}