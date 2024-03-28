import java.io.*;

class DSumOfDivisors {

    public void solve(int tc) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());

            int result = 0;
            for (int k = 1; k <= n; k++) {
                result += k / 2 * (n / k) * (1 + n / k);
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(0);
    }
}