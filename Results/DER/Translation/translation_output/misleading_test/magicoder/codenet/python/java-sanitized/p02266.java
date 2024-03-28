import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cnt = 0;
        List<Integer> g = new ArrayList<>();
        g.add(0);
        for (char c : input.toCharArray()) {
            cnt += switch (c) {
                case '_' -> 0;
                case '/' -> 1;
                case '\\' -> -1;
                default -> 0;
            };
            g.add(cnt);
        }

        int gmax = g.get(0);
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1) < g.get(i) && g.get(i) <= gmax) {
                g.set(i, g.get(i) + 1000);
            }
            gmax = Math.max(gmax, g.get(i));
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer safaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (safaceLevel != null) {
                volume += safaceLevel - g.get(i);
                if (safaceLevel == g.get(i)) {
                    puddles.add(volume);
                    safaceLevel = null;
                    volume = 0;
                }
            }
            if (safaceLevel == null && g.get(i) > 1000) {
                safaceLevel = g.get(i) - 1000;
            }
        }

        puddles = puddles.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(puddles.stream().mapToInt(Integer::intValue).sum());
        System.out.println(puddles.size());
        for (int puddle : puddles) {
            System.out.print(puddle + " ");
        }
    }
}