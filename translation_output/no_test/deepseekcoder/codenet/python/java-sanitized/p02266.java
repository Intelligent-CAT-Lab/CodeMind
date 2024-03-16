import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int[] g = new int[input.length() + 1];
        g[0] = 0;
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '_':
                    cnt += 0;
                    break;
                case '/':
                    cnt += 1;
                    break;
                case '\\':
                    cnt -= 1;
                    break;
            }
            g[i + 1] = cnt;
        }

        int gmax = g[0];
        boolean[] mark = new boolean[g.length];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1] < g[i] && g[i] <= gmax) {
                mark[i] = true;
            }
            gmax = Math.max(gmax, g[i]);
        }

        ArrayList<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer saface_level = null;

        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level != null) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles.add(volume);
                    saface_level = null;
                    volume = 0;
                }
            }
            if (saface_level == null && mark[i]) {
                saface_level = g[i];
            }
        }

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
}