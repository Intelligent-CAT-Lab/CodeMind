<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
print(*divmod(int(input())*2,60))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = h*3600 + m*60 + s;
        int h1 = t/3600;
        int m1 = (t%3600)/60;
        int s1 = t%60;
        System.out.println(h1+" "+m1+" "+s1);
    }
}
```
'''
<|endoftext|>
