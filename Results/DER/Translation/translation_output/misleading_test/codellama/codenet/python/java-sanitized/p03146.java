import java.util.Scanner;
import java.util.HashSet;
import java.util.Deque;

public class p03146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        scanner.close();

        int m = 1;
        int pre = s;
        HashSet<Integer> st = new HashSet<>();
        st.add(s);

        while (true) {
            m++;
            if (pre % 2 == 0) {
                pre = pre / 2;
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