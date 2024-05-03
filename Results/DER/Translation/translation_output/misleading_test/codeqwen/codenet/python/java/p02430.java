Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int r = 1; r <= k; r++) {
            combs.addAll(combinations(l, r));
        }

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<List<Integer>> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            List<Integer> pair = new ArrayList<>();
            pair.add(sumlist.get(i));
            pair.add(combs.get(i));
            z.add(pair);
        }

        z.sort(Comparator.comparing(pair -> pair.get(0)));

        for (List<Integer> pair : z) {
            List<Integer> comb = pair.get(1);
            String c_str = "";
            for (int i = 0; i < comb.size(); i++) {
                if (i > 0) {
                    c_str += " ";
                }
                c_str += comb.get(i);
            }
            System.out.println(pair.get(0) + ": " + c_str);
        }
    }

    public static List<List<Integer>> combinations(List<Integer> l, int r) {
        List<List<Integer>> result = new ArrayList<>();
        combinations
