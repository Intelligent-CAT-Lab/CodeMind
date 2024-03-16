<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        System.out.println(a1*a2);
    }
}
```
</s>
