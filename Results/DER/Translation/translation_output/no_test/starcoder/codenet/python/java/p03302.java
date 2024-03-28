<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
if a+b == 15:
    print('+')
elif a*b == 15:
    print('*')
else:
    print('x')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }
    }
}
```
'''
<|endoftext|>
