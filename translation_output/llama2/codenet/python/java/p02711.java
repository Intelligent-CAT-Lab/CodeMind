<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = input()

if "7" in N:
    print("Yes")
else:
    print("No")
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
