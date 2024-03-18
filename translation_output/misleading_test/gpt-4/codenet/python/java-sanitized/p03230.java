import java.util.*;
import java.io.*;

public class p03230 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(reader.readLine().trim());

        int K = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            writer.write("No");
            writer.flush();
            return;
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<Integer>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        writer.write("Yes\n");
        writer.write(K + "\n");

        for (List<Integer> s : S) {
            writer.write((K - 1) + " ");
            for (int num : s) {
                writer.write(num + " ");
            }
            writer.newLine();
        }

        writer.flush();
    }
}