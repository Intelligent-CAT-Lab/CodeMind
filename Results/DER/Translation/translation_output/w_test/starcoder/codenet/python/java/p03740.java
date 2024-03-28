<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown


```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(Math.abs(x-y)<=1)
            System.out.println("Brown");
        else
            System.out.println("Alice");
    }
}
```
'''
<|endoftext|>
