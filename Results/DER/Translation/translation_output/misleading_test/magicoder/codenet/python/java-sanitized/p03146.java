import java.util.*;
import java.io.*;

public class p03146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        while (true) {
            m += 1;
            int tmp;
            if (pre % 2 == 0) {
                tmp = pre / 2;
            } else {
                tmp = 3 * pre + 1;
            }
            if (st.contains(tmp)) {
                System.out.println(m);
                return;
            }
            pre = tmp;
            st.add(tmp);
        }
    }
}