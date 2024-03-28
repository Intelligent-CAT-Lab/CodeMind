import java.util.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        List<int[]> edges = new ArrayList<>();
        int length = (int) Math.pow(2, L - 1);
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
            edges.add(new int[]{i, i + 1, 0});
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L >> i) & 1 == 1) {
                L -= Math.pow(2, i);
                edges.add(new int[]{i + 1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1]);
        }
    }
}