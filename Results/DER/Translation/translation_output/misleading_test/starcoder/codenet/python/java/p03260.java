<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
5Yes

```
a, b = map(int, input().split())
print("Yes" if a % 2!= 0 and b % 2!= 0 else "No")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2!=0 && b%2!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```

'''
<|endoftext|>
