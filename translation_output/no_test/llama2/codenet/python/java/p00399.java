<s> Translate the following python code to java and enclose your solution inside ```java```:
```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```

### Input

```
10 20 30 40
```

### Output

```
10203040
```

### Explanation

```
r,b,w,g = map(int,input().split())
```

### Hint

```
r,b,w,g = map(int,input().split())
```

### Solution

```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(r+b+w+g);
    }
}
```
</s>
