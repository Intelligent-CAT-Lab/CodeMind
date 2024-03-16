<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
print(0 if a<b else 10)
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}
```
</s>
