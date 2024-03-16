```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine().trim());
        List<Triplet<Integer, Integer, Integer>> edges = new ArrayList<>();

        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new Triplet<>(i, i + 1, 1 << (i - 1)));
            edges.add(new Triplet<>(i, i + 1, 0));
        }

        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= 1 << i;
                edges.add(new Triplet<>(i + 1, length, L));
            }
        }

        System.out.println(length + " " + edges.size());
        for (Triplet<Integer, Integer, Integer> edge : edges) {
            System.out.println(edge.getFirst() + " " + edge.getSecond() + " " + edge.getThird());
        }
    }

    static class Triplet<U, V, W> {
        private U first;
        private V second;
        private W third;

        public Triplet(U first, V second, W third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public U getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        public W getThird() {
            return third;
        }
    }
}
```

