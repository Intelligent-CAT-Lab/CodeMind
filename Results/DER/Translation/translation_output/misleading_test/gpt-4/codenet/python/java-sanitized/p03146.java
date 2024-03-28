import java.util.Scanner;
import java.util.HashSet;

public class p03146 {
    private static int s;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        solve();
        scanner.close();
    }
    
    private static void solve() {
        int m = 1;
        long pre = s;
        HashSet<Long> st = new HashSet<>();
        st.add(pre);
        
        while (true) {
            m += 1;
            if (pre % 2 == 0)
                pre /= 2;
            else
                pre = 3 * pre + 1;
            
            if (st.contains(pre)) {
                System.out.println(-m);
                return;
            }
            
            st.add(pre);
        }
    }
}