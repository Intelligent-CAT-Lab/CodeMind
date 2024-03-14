<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2*a + 4*b == y) {
                count = 1;
                break;
            } else {
                pass;
            }
        }
        System.out.println("Yes" if count == 1 else "No");
    }
}
```
<|endoftext|>
