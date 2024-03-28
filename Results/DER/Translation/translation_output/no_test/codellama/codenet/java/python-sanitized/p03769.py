import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class p03769 {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    static void solve() {
        long n = nl();
        List<Integer> perm = permutationWhoseNumberOfIncreasingSequenceIsK(n);
        out.println(perm.size() * 2);
        for (int i = 1; i <= perm.size(); i++) {
            if (i > 1)