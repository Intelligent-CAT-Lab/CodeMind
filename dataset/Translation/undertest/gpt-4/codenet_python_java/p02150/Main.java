import java.io.*;

public class p02150 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        long ans = (long)x + (long)n * b;

        System.out.println(ans % 1000000007);
    }
}