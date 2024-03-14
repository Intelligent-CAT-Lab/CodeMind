import java.util.ArrayList;
import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<int[]> edge = new ArrayList<>();

        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng)
                        continue;
                    edge.add(new int[]{s, t});
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng)
                        continue;
                    edge.add(new int[]{s, t});
                }
            }
        }

        System.out.println(edge.size());
        for (int[] e : edge) {
            System.out.println(e[0] + " " + e[1]);
        }
    }
}