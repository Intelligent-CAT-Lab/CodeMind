<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
NEO

```
a,b,c=map(int, input().split())
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 5 && b == 5 && c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
'''
<|endoftext|>
