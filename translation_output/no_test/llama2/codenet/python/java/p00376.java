<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```
</s>
