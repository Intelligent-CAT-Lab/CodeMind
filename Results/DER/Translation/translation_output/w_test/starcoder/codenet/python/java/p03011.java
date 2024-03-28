<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
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
        System.out.println(a+b+c-Math.max(a,Math.max(b,c)));
    }
}
```
'''
<|endoftext|>
