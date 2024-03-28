Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1000000


```
import java.util.*;
 
public class p02853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (X == 1 && Y == 1) {
            ans = 1000000;
        } else {
            if (X == 1) {
                ans += 300000;
            }
            if (Y == 1) {
                ans += 300000;
            }
            if (X == 2) {
                ans += 200000;
            }
            if (Y == 2) {
                ans += 200000;
            }
            if (X == 3) {
                ans += 100000;
            }
            if (Y == 3) {
                ans += 100000;
            }
        }
        System.out.println(ans);
    }
}

```

### Response:
```python
import java.util.*;

public class p02853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (X == 1 and Y == 1):
            ans = 1000000;
        else:
            if (X == 1):
                ans += 300000;
            if (Y == 1):
                ans += 300000;
            if (X == 2):
                ans += 200000;
            if (Y == 2):
                ans += 200000;
            if (X == 3):
                ans += 100000;
            if (Y == 3):
                ans += 100000;
        System.out.println(ans);
    }
}
```

Note: In Python, the `and` operator is used instead of the `&&` operator used in Java. Also, the `if` statement in Python does not need a colon at the end.<|endoftext|>
