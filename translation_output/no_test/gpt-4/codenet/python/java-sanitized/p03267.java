import java.util.*;
import java.io.*;

public class p03267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());
        List<int[]> edges = new ArrayList<>();
        int length = Integer.SIZE - Integer.numberOfLeadingZeros(L); // equivalent to bit_length

        for (int i = 1; i < length; i++) {
            edges.add(new int[] {i, i + 1, 1 << (i - 1)});
            edges.add(new int[] {i, i + 1, 0});
        }

        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= 1 << i;
                edges.add(new int[] {i + 1, length, L});
            }
        }

        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}