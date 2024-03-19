<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3266

```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            System.out.println(a * b);
        } else {
            System.out.println(b * a);
        }
    }
}
```
'''
<|endoftext|>
