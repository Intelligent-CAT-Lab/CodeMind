import java.io.*;

public class p03939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = (int) (d + (d / N) + (5 * x) / (2 * N));
            x += 2 * x / N;
            N--;
        }

        bw.write(String.valueOf(ret));
        bw.flush();
        bw.close();
    }
}