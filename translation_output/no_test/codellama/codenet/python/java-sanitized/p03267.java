import java.util.Scanner;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[] edges = new int[length * 2];
        for (int i = 1; i < length; i++) {
            edges[i * 2 - 1] = i;
            edges[i * 2] = i + 1;
            edges[i * 2 - 1] = 2 ** (i - 1);
            edges[i * 2] = 0;
        }
        for (int i = length - 1; i > 0; i--) {
            if (L >> i & 1) {
                L -= 2 ** i;
                edges[i * 2 - 1] = i + 1;
                edges[i * 2] = length;
                edges[i * 2 - 1] = L;
            }
        }
        System.out.println(length + " " + edges.length);
        for (int i = 0; i < edges.length; i++) {
            System.out.println(edges[i]);
        }
    }
}