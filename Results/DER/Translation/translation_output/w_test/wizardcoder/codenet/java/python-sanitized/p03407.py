import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Scanner;

public class p03407 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        ATwoCoins solver = new ATwoCoins();
        solver.solve(1, in, new PrintWriter(outputStream));
        in.close();
        outputStream.close();
    }

    static class ATwoCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(a + b >= c? "Yes" : "No");
        }
    }
}