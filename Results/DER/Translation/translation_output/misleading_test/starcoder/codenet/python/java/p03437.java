<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
-50

```
x,y=map(int,input().split())
print(x if x%y else -1)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x%y==0?x:-1);
    }
}
```
'''
<|endoftext|>
