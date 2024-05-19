System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
AWBC

```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toUpperCase();
        String s2 = sc.next().toUpperCase();
        String s3 = sc.next().toUpperCase();
        System.out.println(s1.charAt(0)+""+s2.charAt(0)+""+s3.charAt(0));
    }
}
```

Test input:
atcoder beginner contest

Expected output:
AWBC<|endoftext|>
