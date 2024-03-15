<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```

### Input

```
1 2
```

### Output

```
[12,'error']
```

### Explanation

```
a,b=input().split();
print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```

### Code

```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        if (sum >= 10) {
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }
}
```
</s>
