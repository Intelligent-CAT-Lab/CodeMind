```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> n = new ArrayList<>();
        for (char c : input.toCharArray()) {
            n.add(c);
        }
        Collections.reverse(n);
        int lb = 0;
        int ub = n.size();

        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(n, 9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(List<Character> n, int x) {
        int g = 0;
        for (Character i : n) {
            x -= (x + g - Character.getNumericValue(i)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```
