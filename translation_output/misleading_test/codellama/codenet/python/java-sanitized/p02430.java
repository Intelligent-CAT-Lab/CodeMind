import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
        for (int i = 0; i < k; i++) {
            combs.add(new ArrayList<>());
        }

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < k; j++) {
                combs.get(j).add(l.get(i));
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

        List<List<Integer>> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            z.add(new ArrayList<>());
            z.get(i).add(sumlist.get(i));
            z.get(i).add(combs.get(i));
        }

        z = z.stream().sorted(Comparator.comparing(a -> a.get(0))).collect(Collectors.toList());

        sumlist = new ArrayList<>();
        combs = new ArrayList<>();
        for (List<Integer> a : z) {
            sumlist.add(a.get(0));
            combs.add(a.get(1));
        }

        for (int i = 0; i < sumlist.size(); i++) {
            String c_str = "";
            for (int c : combs.get(i)) {
                c_str += c + " ";
            }
            System.out.println(sumlist.get(i) + ": " + c_str);
        }
    }
}