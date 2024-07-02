import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
System.out.println("[INST]7;n;Integer.parseInt(sc.next());"+n);
System.out.println("[INST]7;None;sc.next();"+sc.next());
        int k = Integer.parseInt(sc.next());
System.out.println("[INST]8;k;Integer.parseInt(sc.next());"+k);
System.out.println("[INST]8;None;sc.next();"+sc.next());

        List<Pair> l = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            l.add(new Pair(1, i));
System.out.println("[INST]12;None;l.add(new Pair(1, i));"+l.add(new Pair(1, i)));
        }

        int now = (n - 1) * (n - 2) / 2;
        if (now < k) {
            System.out.println("-1");
            return;
        }

        int from = 2;
        int to = 3;

        while (now > k) {
            l.add(new Pair(from, to));
System.out.println("[INST]25;None;l.add(new Pair(from, to));"+l.add(new Pair(from, to)));
            now--;
            if (to == n) {
                from++;
                to = from + 1;
            } else {
                to++;
            }
        }

        System.out.println(l.size());
        for (Pair p : l) {
            System.out.println(p.u + " " + p.v);
        }
    }

    public static class Pair {
        int u;
        int v;

        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }
}
