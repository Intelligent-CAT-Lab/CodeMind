<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
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
        if (a + b < c) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

'''
<|endoftext|>
