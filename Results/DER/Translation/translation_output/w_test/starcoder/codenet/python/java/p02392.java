<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Yes


```
a,b,c = map(int,input().split())
if a<b<c:
    print("Yes")
else:
    print("No")


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
        if(a<b && b<c)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
<|endoftext|>
