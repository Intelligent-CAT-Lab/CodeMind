import java.util.*;
import java.io.*;

public class p03267 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = Integer.bitCount(L);
        List<int[]> edges = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, 2*(1<<i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        for (int i = length-1; i >= 0; i--) {
            if ((L >> i & 1) == 1) {
                L -= 1 << i;
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