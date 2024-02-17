
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 1 << 28;
    void run() {
        Scanner sc = new Scanner(System.in);
        dfs(sc.nextInt(), sc.nextInt(), "");
    }
    
    void dfs(int j, int y, String ans) {
//        debug(j, y, ans);
        if ((j|y) == 0) {
            if (ok(ans)) {
                System.out.println(ans);
            }
        }
        if (j > 0) dfs(j-1, y, ans + 'A');
        if (y > 0) dfs(j, y-1, ans + 'B');
    }
    
    boolean ok(String ans) {
        int jc = 0, yc = 0;
        for (int i = 0, l = ans.length(); i < l; i++) {
            if (ans.charAt(i) == 'A') jc++;
            else yc++;
//            debug(jc, yc);
            if ((3 >= jc && yc == 5) || (3 >= yc && jc == 5)) {
                return jc + yc == l;
            }
            if (jc == yc && jc == 5) {
                return jc + yc == l;
            }
            if ((jc == 4 && yc == 6) || (yc == 4 && jc == 6)) {
                return jc + yc == l;
            }
        }
        return true;
    }
    
    void debug(Object...os) {
        System.out.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}