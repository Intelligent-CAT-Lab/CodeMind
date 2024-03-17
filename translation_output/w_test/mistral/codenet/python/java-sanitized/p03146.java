import java.util.*;

public class p03146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = 1;
        Set<Integer> st = new HashSet<>();
        int pre = s;
        while (true) {
            m++;
            if (pre % 2 == 0) {
                int tmp = pre / 2;
                if (st.contains(tmp)) {
                    System.out.println(m);
                    return;
                }
            } else {
                int tmp = 3 * pre + 1;
                if (st.contains(tmp)) {
                    System.out.println(m);
                    return;
                }
            }
            pre = tmp;
            st.add(tmp);
        }
    }
}