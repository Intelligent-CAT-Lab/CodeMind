import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

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
            List<Integer> comb = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i & (1 << j)) {
                    comb.add(j);
                }
            }
            combs.add(comb);
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
            List<Integer> zi = new ArrayList<>();
            zi.add(sumlist.get(i));
            zi.add(combs.get(i));
            z.add(zi);
        }
        z = z.stream().sorted(Comparator.comparing(zi -> zi.get(0))).collect(Collectors.toList());
        sumlist = z.stream().map(zi -> zi.get(0)).collect(Collectors.toList());
        combs = z.stream().map(zi -> zi.get(1)).collect(Collectors.toList());
        for (int i = 0; i < sumlist.size(); i++) {
            String c_str = combs.get(i).stream().map(c -> String.valueOf(c)).collect(Collectors.joining(" "));
            System.out.println(sumlist.get(i) + ": " + c_str);
        }
    }
}