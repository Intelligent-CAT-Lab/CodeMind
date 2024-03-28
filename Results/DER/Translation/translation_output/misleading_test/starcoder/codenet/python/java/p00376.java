<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 30

Expected output:
2

```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

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
'''
<|endoftext|>
