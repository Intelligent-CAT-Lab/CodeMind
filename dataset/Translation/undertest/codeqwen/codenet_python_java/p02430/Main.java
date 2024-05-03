import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        combine(l, k, 0, new ArrayList<>(), combs);

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
            List<Integer> temp = new ArrayList<>();
            temp.add(sumlist.get(i));
            temp.add(combs.get(i));
            z.add(temp);
        }

        Collections.sort(z, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        for (List<Integer> list : z) {
            String c_str = "";
            for (int i = 1; i < list.size(); i++) {
                c_str += list.get(i) + " ";
            }
            System.out.println(list.get(0) + ": " + c_str.trim());
        }
    }

    private static void combine(List<Integer> l, int k, int start,