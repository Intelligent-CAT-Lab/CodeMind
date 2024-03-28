import java.util.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[][] edges = new int[length][3];
        for (int i = 0; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = 2 << i;
        }
        for (int i = 0; i < length - 1; i++) {
            if ((L & (1 << i))!= 0) {
                edges[i][2] = L;
                L -= 1 << i;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int[] edge : edges) {
            for (int i : edge) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}