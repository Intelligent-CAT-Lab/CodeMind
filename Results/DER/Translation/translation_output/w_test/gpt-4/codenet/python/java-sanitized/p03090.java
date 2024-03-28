import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03090 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<int[]> edge = new ArrayList<>();

        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new int[]{s, t});
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge.add(new int[]{s, t});
                }
            }
        }

        System.out.println(edge.size());
        for (int[] pair : edge) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}