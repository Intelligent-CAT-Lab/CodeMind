import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p02266 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int cnt = 0;
        List<int[]> g = new ArrayList<>();
        g.add(new int[]{0, false});
        for (char c : input.toCharArray()) {
            g.add(new int[]{func(c, cnt), false});
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
        Integer saface_level = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (saface_level != null) {
                volume += saface_level - g.get(i)[0];
                if (saface_level == g.get(i)[0]) {
                    puddles.add(volume);
                    saface_level = null;
                    volume = 0;
                }
            }
            if (saface_level == null && g.get(i)[1]) {
                saface_level = g.get(i)[0];
            }
        }

        Collections.reverse(puddles);
        
        int sum = puddles.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(puddles.size() + " " + puddles.toString());
    }

    public static int func(char c, int cnt) {
        cnt += c == '_' ? 0 : (c == '/' ? 1 : -1);
        return cnt;
    }
}