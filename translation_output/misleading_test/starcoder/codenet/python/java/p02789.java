<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
64s

```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

'''
<|endoftext|>
