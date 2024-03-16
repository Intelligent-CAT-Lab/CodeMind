<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if a<b<c:
    print("Yes")
else:
    print("No")


```

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
