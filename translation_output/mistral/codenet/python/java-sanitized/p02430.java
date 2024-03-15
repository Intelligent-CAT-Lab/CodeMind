import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] l = new int[n];
        Arrays.fill(l, 0);
        List<int[]> combs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            combs.add(new int[]{i});
        }
        List<Integer> sumlist = new ArrayList<>();
        for (int[] comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        List<int[]> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            z.add(new int[]{sumlist.get(i), comb[i]});
        }
        Collections.sort(z, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int[] z : z) {
            String c_str = String.join(" ", Arrays.toString(z[1]));
            System.out.println(z[0] + ": " + c_str);
        }
    }
}