<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# ã¹ãã¼ã¹åºåãã®æ´æ°ã®å¥å
X,Y,Z = map(int, input().split())

A=X
B=Y
C=Z

B=X
C=Y
A=Z

print(A,B,C)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = x;
        int b = y;
        int c = z;
        b = x;
        c = y;
        a = z;
        System.out.println(a + " " + b + " " + c);
    }
}
```

"""

# %%
<|endoftext|>
