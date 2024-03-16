<s> Translate the following python code to java and enclose your solution inside ```java```:
```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

### Input

```
5 100
```

### Output

```
Yes
```

### Explanation

```
500*5>=100
```

### Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, X;
        K = sc.nextInt();
        X = sc.nextInt();
        System.out.println("Yes" + (500*K>=X ? "": "No"));
    }
}
```
</s>
