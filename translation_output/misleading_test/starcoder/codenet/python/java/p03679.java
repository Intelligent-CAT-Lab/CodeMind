<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 6

Expected output:
sfe

```
x,a,b=map(int,input().split())
if b<=a:
  print('delicious')
elif (b-a)<=x:
  print('safe')
else:
  print('dangerous')
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
        if(b<=a)
            System.out.println("delicious");
        else if(b-a<=x)
            System.out.println("safe");
        else
            System.out.println("dangerous");
    }
}
```
'''
<|endoftext|>
