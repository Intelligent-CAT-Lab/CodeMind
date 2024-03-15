<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```

### Input

```
1 2 3
```

### Output

```
123
```

### Explanation

```
A123C
```

### Hint

```
A,x,C=input().split()
```

### Solution

```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String x = sc.nextLine();
        String C = sc.nextLine();
        System.out.println(A+x[0]+C);
    }
}
```
</s>
