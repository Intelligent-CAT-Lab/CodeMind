import java.util.*;

public class p03146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = 1;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        int pre = s;
        while (true) {
            m++;
            if (pre % 2 == 0) {
                pre /= 2;
            } else {
                pre = 3 * pre + 1;
            }
            if (st.contains(pre)) {
                System.out.println(m);
                break;
            }
            st.add(pre);
        }
    }
}