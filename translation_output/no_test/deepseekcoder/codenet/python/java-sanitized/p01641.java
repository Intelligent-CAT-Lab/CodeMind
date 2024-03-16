import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class p01641 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();

        List<Integer> memory = new ArrayList<>();
        for (int i = 30; i <= 120; i += 10) {
            memory.add(i);
        }

        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) {
            r.append("+".repeat(i));
            r.append(">");
        }
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int cInt = (int) c;
            int n = cInt / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;

            int l = Math.abs(memory.get(point) - cInt);
            if (memory.get(point) < cInt) {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory.set(point, cInt);

            r.append(".");
        }

        System.out.println(r);
    }
}