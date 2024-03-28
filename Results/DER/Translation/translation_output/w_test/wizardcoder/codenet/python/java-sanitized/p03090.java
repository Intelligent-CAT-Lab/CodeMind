import java.util.*;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
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
        for (Pair p : edge) {
            System.out.println(p.s + " " + p.t);
        }
    }
}

class Pair {
    int s;
    int t;

    public Pair(int s, int t) {
        this.s = s;
        this.t = t;
    }
}