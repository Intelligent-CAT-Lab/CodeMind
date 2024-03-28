import java.util.*;

public class p02266 {
    static int cnt = 0;
    static List<Integer> g = new ArrayList<>();
    static List<Integer> puddles = new ArrayList<>();
    static Integer saface_level = null;
    static int volume = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        g.add(0);
        for (char c : input.toCharArray()) {
            g.add(func(c));
        }

        int gmax = g.get(0);
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1) < g.get(i) && g.get(i) <= gmax) {
                g.set(i, g.get(i) + 1000);
            }
            gmax = Math.max(gmax, g.get(i));
        }

        for (int i = g.size() - 1; i >= 0; i--) {
            if (saface_level != null) {
                volume += saface_level - g.get(i);
                if (saface_level == g.get(i)) {
                    puddles.add(volume);
                    saface_level = null;
                    volume = 0;
                }
            }
            if (saface_level == null && g.get(i) > 1000) {
                saface_level = g.get(i) - 1000;
            }
        }

        Collections.reverse(puddles);
        int sum = 0;
        for (int puddle : puddles) {
            sum += puddle;
        }
        System.out.println(sum);
        System.out.println(puddles.size());
        for (int puddle : puddles) {
            System.out.print(puddle + " ");
        }
    }

    static int func(char c) {
        cnt += switch (c) {
            case '_' -> 0;
            case '/' -> 1;
            case '\\' -> -1;
            default -> 0;
        };
        return cnt;
    }
}