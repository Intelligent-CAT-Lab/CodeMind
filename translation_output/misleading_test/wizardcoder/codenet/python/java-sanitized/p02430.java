import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p02430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        ArrayList<ArrayList<Integer>> combs = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <= k; i++) {
            for (ArrayList<Integer> c : combinations(l, i)) {
                combs.add(c);
            }
        }

        ArrayList<Integer> sumlist = new ArrayList<Integer>();
        for (ArrayList<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        ArrayList<Integer> sortedSumlist = new ArrayList<Integer>(sumlist);
        Collections.sort(sortedSumlist);

        ArrayList<ArrayList<Integer>> sortedCombs = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < sortedSumlist.size(); i++) {
            int sum = sortedSumlist.get(i);
            for (int j = 0; j < combs.size(); j++) {
                if (sumlist.get(j) == sum) {
                    sortedCombs.add(combs.get(j));
                }
            }
        }

        for (int i = 0; i < sortedSumlist.size(); i++) {
            int sum = sortedSumlist.get(i);
            ArrayList<Integer> comb = sortedCombs.get(i);
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j) + " ";
            }
            System.out.println(sum + ": " + c_str.trim());
        }
    }

    public static ArrayList<ArrayList<Integer>> combinations(ArrayList<Integer> l, int k) {
        ArrayList<ArrayList<Integer>> combs = new ArrayList<ArrayList<Integer>>();
        if (k == 0) {
            combs.add(new ArrayList<Integer>());
            return combs;
        }
        for (int i = 0; i < l.size(); i++) {
            ArrayList<Integer> c = new ArrayList<Integer>();
            c.add(l.get(i));
            for (ArrayList<Integer> cc : combinations(new ArrayList<Integer>(l.subList(i + 1, l.size())), k - 1)) {
                c.addAll(cc);
            }
            combs.add(c);
        }
        return combs;
    }
}