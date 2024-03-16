import java.util.*;

public class p03267 {
    static Scanner sc = new Scanner(System.in);
    static int L;
    static List<int[]> edges = new ArrayList<>();

    public static void main(String[] args) {
        L = sc.nextInt();
        for (int i = 0; i < L; i++) {
            int[] edge = new int[3];
            edge[0] = i;
            edge[1] = i + 1;
            edge[2] = (1 << (L - i - 1));
            edges.add(edge);
            edge[0] = i;
            edge[1] = i + 1;
            edge[2] = 0;
            edges.add(edge);
        }

        // 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
        // Lã«è¿ãåãç«¯ããå¦çeninxãã¦ãdfãaki
        for (int i = 0; i < L - 1; i++) {
            if ((L >> i) & 1 == 1) {
                L -= (1 << i);
                edges.add(new int[]{i + 1, L, L});
            }
        }

        System.out.println(L, edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}