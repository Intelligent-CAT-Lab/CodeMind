import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> comb = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    comb.add(j);
                }
            }
            if (comb.size() == k) {
                combs.add(comb);
            }
        }

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<Integer> zippedSumlist = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            zippedSumlist.add(i);
        }
        List<List<Integer>> zippedCombs = new ArrayList<>();
        for (List<Integer> comb : combs) {
            zippedCombs.add(comb);
        }

        for (int i = 0; i < zippedSumlist.size(); i++) {
            int sum = sumlist.get(i);
            List<Integer> comb = zippedCombs.get(i);
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j) + " ";
            }
            System.out.println(sum + ": " + c_str.trim());
        }
    }
}