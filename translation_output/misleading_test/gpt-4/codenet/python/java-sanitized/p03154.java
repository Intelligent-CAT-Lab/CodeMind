import java.util.Scanner;
import java.math.BigInteger;

public class p03154 {
    
    private static final int MOD = 1000000007;
    private static final int list_size = 20000001;
    private static long[] f_list = new long[list_size];
    private static long[] f_r_list = new long[list_size];

    public static void main(String[] args) {
        // Precompute factorials and their modular inverses using Fermat's Little