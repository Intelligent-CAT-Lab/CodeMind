<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A+B);
    }
}
```
</s>
