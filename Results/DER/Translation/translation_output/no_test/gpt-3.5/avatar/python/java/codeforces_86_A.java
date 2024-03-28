```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;

        int[] values = new int[] {l, r, first, second};
        
        for (int i : values) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char c : String.valueOf(curr).toCharArray()) {
                    rev = (9 - Character.getNumericValue(c)) + rev;
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        
        System.out.println(ans);
    }
}
```

