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
        for (int i = 0; i <= l.size() - k; i++) {
            combs.add(l.subList(i, i + k));
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

        List<Integer> sortedCombs = new ArrayList<>();
        for (int sum : sortedSumlist) {
            int index = sumlist.indexOf(sum);
            sortedCombs.add(index);
        }

        for (int i = 0; i < sortedSumlist.size(); i++) {
            StringBuilder c_str = new StringBuilder();
            for (int c : combs.get(sortedCombs.get(i))) {
                c_str.append(c).append(" ");
            }
            System.out.println(sortedSumlist.get(i) + ": " + c_str.toString().trim());
        }
    }
}