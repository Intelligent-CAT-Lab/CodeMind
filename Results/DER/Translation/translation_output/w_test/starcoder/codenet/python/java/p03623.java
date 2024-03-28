<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.abs(x-a)<Math.abs(x-b)?"A":"B");
    }
}
```
'''
<|endoftext|>
