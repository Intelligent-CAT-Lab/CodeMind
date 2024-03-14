<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```
<|endoftext|>
