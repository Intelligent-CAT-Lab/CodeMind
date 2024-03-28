import java.io.*;

public class p02582 {

    public static void solve(String s) {
        // In the Java version, we do not have to handle reading from stdin buffer,
        // as the string input is directly passed to the solve method.
        int result = 0; // default result.
        if (s.equals("RRR")) {
            result = 3;
        } else if (s.equals("RRS") || s.equals("SRR")) {
            result = 2;
        } else if (!s.contains("R")) {
            result = 0;
        } else {
            result = 1;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Sample test case
        solve("RRS"); // Expected output: 91 (but this appears to be incorrect.