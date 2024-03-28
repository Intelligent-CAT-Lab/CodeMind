Below is the translation of the provided Python code into Java. The Java equivalent uses a `Scanner` object to get the input and a static method to mimic the string conversion and calculation that's happening in the Python code.

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        
        int first = (int)Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        
        int[] candidates = new int[]{l, r, first, second};
        
        for (int i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                String currAsString = Integer.toString(curr);
                
                for (char k : currAsString.toCharArray()) {
                    rev.append(9 - (k - '0'));
                }
                
                int revInt = Integer.parseInt(rev.toString());
                ans = Math.max(ans, revInt * curr);
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This code follows the convention and syntax of Java to achieve the same functionality of your given Python code. It takes two integers as input, then processes them according to the original algorithm, and finally prints out the answer.
