import java.io.*;
import java.util.*;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.*;
import org.apache.commons.math3.transform.TransformType;

public class p02826 {
    static final int MOD = (int)1e9 + 7;
    static final int U = (int)1e5;
    static long[] fact;
    static long[] fact_inv;
    static long[] inv;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        // MOD value should be received from read input.

        makeFact(U, MOD);

        //