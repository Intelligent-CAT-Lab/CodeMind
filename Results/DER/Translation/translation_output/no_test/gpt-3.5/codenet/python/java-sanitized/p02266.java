import java.util.*;

public class p02266 {
    static int func(char c, int cnt) {
        int val = 0;
        switch(c) {
            case '_':
                val = 0;
                break;
            case '/':
                val = 1;
                break;
            case '\\':
                val = -1;
                break;
        }
        return cnt + val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        String input = scanner.nextLine();
        List<int[]> g = new ArrayList<>();
        g.add(new int[]{0, 0});
        for (char c : input.toCharArray()) {
            cnt = func(c, cnt);
            g.add(new int[]{cnt, 0});
        }

        int gmax = g.get(0)[0];
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1)[0] < g.get(i)[0] && g.get(i)[0] <= gmax) {
                g.get(i)[1] = 1;
            }
            gmax = Math.max(gmax, g.get(i)[0]);
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer surfaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (surfaceLevel != null) {
                volume += surfaceLevel - g.get(i)[0];
                if (surfaceLevel == g.get(i)[0]) {
                    puddles.add(volume);
                    surfaceLevel = null;
                    volume = 0;
                }
            }
            if (surfaceLevel == null && g.get(i)[1] == 1) {
                surfaceLevel = g.get(i)[0];
            }
        }

        Collections.reverse(puddles);
        int puddlesSum = puddles.stream().mapToInt(Integer::intValue).sum();
        System.out.println(puddlesSum);
        System.out.print(puddles.size() + " ");
        for (int puddle : puddles) {
            System.out.print(puddle + " ");
        }
    }
}