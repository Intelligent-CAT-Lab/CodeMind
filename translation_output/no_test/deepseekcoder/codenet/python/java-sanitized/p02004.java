import java.util.*;
import java.lang.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = scanner.next();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
        }

        for (int r : rr) {
            System.out.println(r);
        }
    }

    private static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t += 1;
                if (t == 4) {
                    r += 1;
                    t = 0;
                }
            } else {
                t -= 1;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}