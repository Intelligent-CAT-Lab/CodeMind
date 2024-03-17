import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, 1 << (i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        for (int i = 0; i < length-1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= 1 << i;
                edges.add(new int[]{i+1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}