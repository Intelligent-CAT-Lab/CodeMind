```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        
        while (true) {
            m++;
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
```
