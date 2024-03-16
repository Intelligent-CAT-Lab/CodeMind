import java.util.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = Integer.toBinaryString(L).length();
        int[][] edges = new int[length][3];
        for (int i = 1; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = (int) Math.pow(2, i - 1);
            edges[i + length][0] = i;
            edges[i + length][1] = i + 1;
            edges[i + length][2] = 0;
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L >> i & 1) == 1) {
                L -= (int) Math.pow(2, i);
                edges[length + length - 1][0] = i + 1;
                edges[length + length - 1][1] = length;
                edges[length + length - 1][2] = L;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                System.out.print(edges[i][j] + " ");
            }
            System.out.println();
        }
    }
}