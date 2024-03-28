import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p02430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        List<List<Integer>> combs = new ArrayList<>();
        for (List<Integer> c : itertools.combinations(l, k)) {
            combs.add(c);
        }
        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        List<Integer> sortedSumlist = new ArrayList<>(sumlist);
        Collections.sort(sortedSumlist);
        List<List<Integer>> sortedCombs = new ArrayList<>();
        for (int i : sortedSumlist) {
            for (List<Integer> comb : combs) {
                if (sumlist.get(combs.indexOf(comb)) == i) {
                    sortedCombs.add(comb);
                }
            }
        }
        for (int i = 0; i < sortedSumlist.size(); i++) {
            List<Integer> comb = sortedCombs.get(i);
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j) + " ";
            }
            System.out.println(sortedSumlist.get(i) + ": " + c_str.trim());
        }
    }
}