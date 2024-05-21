import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        List<int[]> g = new ArrayList<>();
        g.add(new int[]{0, false});
        for (char c : s.toCharArray()) {
            cnt += switch (c) {
                case '_' -> 0;
                case '/' -> 1;
                case '\\' -> -1;
                default -> throw new IllegalArgumentException("Invalid character: " + c);
            };
            g.add(new int[]{cnt, false});
        }

        int gmax = g.get(0)[0];
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1)[0] < g.get(i)[0] && g.get(i)[0] <= gmax) {
                g.get(i)[1] = true;
            }
            gmax = Math.max(gmax, g.get(i)[0]);
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer safaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (safaceLevel!= null) {
                volume += safaceLevel - g.get(i)[0];
                if (safaceLevel == g.get(i)[0]) {
                    puddles.add(volume);
                    safaceLevel = null;
                    volume = 0;
                }
            }
            if (safaceLevel == null && g.get(i)[1]) {
                safaceLevel = g.get(i)[0];
            }
        }

        Collections.reverse(puddles);
        System.out.println(puddles.stream().mapToInt(Integer::intValue).sum());
        System.out.print(puddles.size());
        for (int i : puddles) {
            System.out.print(" " + i);
        }
    }
}