```java
import java.util.Scanner;
import java.util.HashSet;

public class CollatzConjecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        HashSet<Integer> st = new HashSet<>();
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
