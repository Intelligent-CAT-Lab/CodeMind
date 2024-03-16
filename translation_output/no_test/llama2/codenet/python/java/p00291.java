<s> Translate the following python code to java and enclose your solution inside ```java```:
```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```

### Input

```
1 2 3 4 5 6
```

### Output

```
1
```

### Explanation

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
```

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
```

```
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
```

```
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
```

```
print(1 if sum >= 1000 else 0)
```

```
print(1 if sum >= 1000 else 0)
```

### Hint

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
```

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
```

```
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
```

```
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
```

```
print(1 if sum >= 1000 else 0)
```

```
print(1 if sum >= 1000 else 0)
```

### Solution

```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c5, c10, c50, c100, c500;
        c1 = sc.nextInt();
        c5 = sc.nextInt();
        c10 = sc.nextInt();
        c50 = sc.nextInt();
        c100 = sc.nextInt();
        c500 = sc.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        System.out.println(1 if sum >= 1000 else 0);
    }
}
```
</s>
