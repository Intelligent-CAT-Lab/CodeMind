import java.util.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        List<int[]> edges = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, 2*(int)Math.pow(2, i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        int mask = (int) Math.pow(2, length-1) - 1;
        L &= mask;
        for (int i = length-1; i >= 0; i--) {
            if ((L & (1 << i))!= 0) {
                L -= (1 << i);
                edges.add(new int[]{i+1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            for (int x : edge) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}