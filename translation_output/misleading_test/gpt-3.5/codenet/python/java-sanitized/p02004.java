import java.util.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();

        while (true) {
            String n = scanner.nextLine();
            if (n.equals("0")) {
                break;
            }
            results.add(f(n));
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int f(String n) {
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