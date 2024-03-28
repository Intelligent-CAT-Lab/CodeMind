import java.util.ArrayList;
import java.util.List;

public class p03090 {

    public static void main(String[] args) {
        int N = 3;

        List<Pair> edge = new ArrayList<>();

        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new Pair(s, t));
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new Pair(s, t));
                }
            }
        }

        System.out.println(edge.size());
        for (Pair pair : edge) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}