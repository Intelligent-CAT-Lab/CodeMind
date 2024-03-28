import java.util.*;

public class p01425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = 98;
        double eps = 1e-10;
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        ArrayList<int[]> obstacles = new ArrayList<int[]>();
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int B = sc.nextInt();
            int R = sc.nextInt();
            int T = sc.nextInt();
            if (L < X) {
                obstacles.add(new int[]{L, B, Math.min(R, X), T});
            }
        }
        boolean found = false;
        for (int i = 0; i < obstacles.size(); i++) {
            int[] obs = obstacles.get(i);
            if (obs[0] == 0) {
                if (check(X, Y, obs)) {
                    found = true;
                    break;
                }
            } else if (obs[1] <= Y && Y <= obs[3]) {
                if (check(obs[0], obs[3], obs) || check(obs[2], obs[3], obs)) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(int x, int y, int[] obs) {
        double vx = x / (double) obs[0];
        double vy = (y - obs[1]) / (double) (obs[3] - obs[1]) * (obs[2] - obs[0]) + obs[1];
        double t = Math.sqrt(vx * vx + vy * vy / g);
        double vy1 = vy + g * t / 2;
        double vy2 = vy - g * t / 2;
        if (vy1 * vy1 < (y - vy1) * (y - vy1) / (double) (obs[3] - obs[1])) {
            return true;
        }
        if (vy2 * vy2 < (y - vy2) * (y - vy2) / (double) (obs[3] - obs[1])) {
            return true;
        }
        return false;
    }
}