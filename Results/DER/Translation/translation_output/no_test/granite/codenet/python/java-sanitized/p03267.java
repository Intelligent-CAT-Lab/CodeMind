import java.util.*;

public class p03267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int)Math.floor(Math.log(L) / Math.log(2)) + 1;
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            edges.add(Arrays.asList(i, i+1, 2**(i-1)));
            edges.add(Arrays.asList(i, i+1, 0));
        }
        for (int i = 0; i < length-1; i++) {
            if ((L >> i & 1) == 1) {
                L -= 2 ** i;
                edges.add(Arrays.asList(i+1, length, L));
            }
        }
        System.out.println(length + " " + edges.size());
        for (List<Integer> edge : edges) {
            for (int x : edge) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}