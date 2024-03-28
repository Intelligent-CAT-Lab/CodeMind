import java.util.*;

public class p03146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        while (true) {
            m++;
            if (pre % 2 == 0) {
                pre /= 2;
            } else {
                pre = 3 * pre + 1;
            }
            if (st.contains(pre)) {
                System.out.println(m);
                return;
            }
            st.add(pre);
        }
    }
}