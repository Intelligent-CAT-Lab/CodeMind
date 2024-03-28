```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<List<Integer>> edges = new ArrayList<>();

        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            List<Integer> edge1 = new ArrayList<>();
            edge1.add(i);
            edge1.add(i + 1);
            edge1.add((int) Math.pow(2, i - 1));
            edges.add(edge1);

            List<Integer> edge2 = new ArrayList<>();
            edge2.add(i);
            edge2.add(i + 1);
            edge2.add(0);
            edges.add(edge2);
        }

        for (int i = 0; i < length - 1; i++) {
            if ((L >> i & 1) == 1) {
                L -= Math.pow(2, i);
                List<Integer> edge = new ArrayList<>();
                edge.add(i + 1);
                edge.add(length);
                edge.add(L);
                edges.add(edge);
            }
        }

        System.out.println(length + " " + edges.size());
        for (List<Integer> edge : edges) {
            for (int num : edge) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```
