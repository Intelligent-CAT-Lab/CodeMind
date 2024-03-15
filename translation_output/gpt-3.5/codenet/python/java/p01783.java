```java
import java.util.*;

public class Main {
    static Map<String, Integer> fm = new HashMap<>();
    
    static int[] dd = new int[]{-1, 0, 1, 0};
    static int[] ddn = new int[]{-1, 0, -1, 1, 0, 1, 1, 1, 1, 0, 1, -1, 0, -1, -1, -1};

    static void setRecursionLimit(int limit) {
        // Set recursion limit here
    }

    static final long inf = 1000000000000000000L;
    static final double eps = 1.0 / 10000000000000L;
    static final int mod = 1000000007;

    static int f(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        int l = s.length();
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        for (char tc : "RL,()".toCharArray()) {
            if (s.contains(Character.toString(tc))) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace("?", "9"));
        }
        fm.put(s, r);
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setRecursionLimit(10000000);
        String s = scanner.nextLine();

        int r = f(s);
        
        if (r < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(r);
        }
    }
}
```  
