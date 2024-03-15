import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p03146 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(reader.readLine().trim());
        solve(s);
    }

    private static void solve(long s) {
        int m = 1;
        long pre = s;
        Set<Long> st = new HashSet<>();
        st.add(s);

        while (true) {
            m += 1;
            long tmp;
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