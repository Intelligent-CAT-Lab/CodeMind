import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cnt = 0;
        List<int[]> g = new ArrayList<>();
        g.add(new int[]{0, false});
        for (char c : input.toCharArray()) {
            int value = 0;
            switch (c) {
                case '_':
                    value = 0;
                    break;
                case '/':
                    value = 1;
                    break;
                case '\\':
                    value = -1;
                    break;
            }
            cnt += value;
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