import java.util.*;

public class p01883 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 50000; i++) {
            a.add(a.get(a.size() - 1) + i);
        }

        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        ArrayList<Integer> r = new ArrayList<>(Collections.nCopies(t, 1));
        r.addAll(Collections.nCopies(t, 0));

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                Collections.swap(r, ti, ti - ts);
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r.size(); i++) {
            sb.append(r.get(i) == 0 ? ')' : '(');
        }
        System.out.println(sb.toString());
    }
}