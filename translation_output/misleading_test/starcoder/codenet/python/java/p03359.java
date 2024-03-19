<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5

Expected output:
33

```
a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a-1);
        else
            System.out.println(a);
    }
}
```
'''
<|endoftext|>
