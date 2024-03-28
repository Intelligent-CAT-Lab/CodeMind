import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        
        int cnt = 0;
        List<int[]> g = new ArrayList<>();
        g.add(new int[] {0, false});
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            cnt = func(cnt, c);
            g.add(new int[] {cnt, false});
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
            if (surfaceLevel == null && g.get(i)[1]) {
                surfaceLevel = g.get(i)[0];
            }
        }

        Collections.reverse(puddles);

        int sumPuddles = puddles.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumPuddles);
        System.out.print(puddles.size());
        for (int puddle : puddles) {
            System.out.print(" " + puddle);
        }
    }

    public static int func(int cnt, char c) {
        cnt += Map.of('_', 0, '/', 1, '\\', -1).get(c);
        return cnt;
    }
}