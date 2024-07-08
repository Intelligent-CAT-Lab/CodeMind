import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1000000);
    StringTokenizer tok = new StringTokenizer("");
    StringBuilder out = new StringBuilder();

    String next() throws IOException {
var newVariable_0 = tok.hasMoreTokens();        if (!newVariable_0) {
var newVariable_1 = in.readLine();            tok = new StringTokenizer(newVariable_1);
        }
var newVariable_2 = tok.nextToken();        return newVariable_2;
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    int n = 0;
    int k = 0;

    void go(int a, int b, int mask, char removed) {
        if (removed == k - 1) {
var newVariable_3 = out.append(a + " " + b + " ");        } else {
            int k1 = 0;
            for (int i = 0; i < k; i++) {
                if ((mask & (1 << i)) == 0 && ((a ^ b) & (1 << i)) > 0) {
                    mask |= (1 << i);
                    removed++;
                    k1 = i;
                    break;
                }
            }
            int a1 = 0;
            for (int j = 0; j < k; j++) {
                if ((mask & (1 << j)) == 0) {
                    a1 = a ^ (1 << j);
                    break;
                }
            }
            go(a, a1, mask, removed);
            go((a1 ^ (1 << k1)), b, mask, removed);
        }
    }

    void slave() throws IOException {
        k = nextInt();
        int A = nextInt();
        int B = nextInt();
        n = 1 << k;
var newVariable_4 = Integer.bitCount(A ^ B);        if (newVariable_4 % 2 == 0) {
var newVariable_5 = out.append("NO");        } else {
var newVariable_6 = out.append("YES\n");            go(A, B, 0, (char) 0);
        }
        System.out.print(out);
    }

    public static void main(String[] args) throws IOException {
        new Main().slave();
    }
}