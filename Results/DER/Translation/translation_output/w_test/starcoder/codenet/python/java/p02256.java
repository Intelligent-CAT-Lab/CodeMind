<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y!= 0:
  x, y = y, x % y
print(y)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        while (x % y!= 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        System.out.println(y);
    }
}
```
<|endoftext|>
