import java.io.*;

public class p03939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = (int) (d + (d / N) + (5 * x) / (2 * N));
            x += 2 * x / N;
            N--;
        }

        bw.write(String.format("%.10f", ret));
        bw.flush();
    }
}