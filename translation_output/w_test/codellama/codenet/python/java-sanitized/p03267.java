import java.util.Scanner;

public class p03267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[][] edges = new int[length][3];

        for (int i = 1; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i + 1;
            edges[i][2] = (int) Math.pow(2, i - 1);
            edges[i][2] = 0;
        }

        for (int i = length - 1; i > 0; i--) {
            if ((L >> i) & 1 == 1) {
                L -= (int) Math.pow(2, i);
                edges[i + 1][0] = i + 1;
                edges[i + 1][1] = length;
                edges[i + 1][2] = L;
            }
        }

        System.out.println(length + " " + edges.length);
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}