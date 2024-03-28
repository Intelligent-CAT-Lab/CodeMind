<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
4


```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
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
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```
'''
<|endoftext|>
