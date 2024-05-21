import java.util.*;
import java.lang.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, (int)Math.pow(2, i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        // 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
        // Lã«è¿ãåãç«¯ããå¦çãã¦ãã
        for (int i = 0; i < length-1; i++) {
            if ((L >> i) % 2 == 1) {
                L -= (int)Math.pow(2, i);
                edges.add(new int[]{i+1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}