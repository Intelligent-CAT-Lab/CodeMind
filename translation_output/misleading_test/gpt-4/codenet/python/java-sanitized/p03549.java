import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class p03549 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int total = 1900 * M + 100 * (N - M);
        BigInteger multiplier = BigInteger.valueOf(2).pow(M);
        BigInteger result = BigInteger.valueOf(total).multiply(multiplier);

        System.out.println(result);
    }
}