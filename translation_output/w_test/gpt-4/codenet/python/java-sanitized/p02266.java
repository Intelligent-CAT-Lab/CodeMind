import java.util.*;

public class p02266 {
    private static int cnt = 0;
    private static List<int[]> g = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        func('_'); // initialize first item
        for (char c : input.toCharArray()) {
            g.add(new int[]{func(c), 0}); // 0 is false in int representation
        }
        scanner.close();

        int gmax = g.get(0)[0];
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1)[0] < g.get(i)[0] && g.get(i)[0] <= gmax) {
                g.get(i)[1] = 1; // 1 is true in int representation
            }
            gmax = Math.max(gmax, g.get(i)[0]);
        }

        ArrayList<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer surfaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (surfaceLevel != null) {
                volume += surfaceLevel - g.get(i)[0];
                if (surfaceLevel.equals(g.get(i)[0])) {
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
        int sum = puddles.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
        System.out.print(puddles.size());
        for (int p : puddles) {
            System.out.print(" " + p);
        }
    }

    // Helper function for processing the character and updating the count
    private static int func(char c) {
        cnt += c == '/' ? 1 : c == '\\' ? -1 : 0;
        return cnt;
    }
}