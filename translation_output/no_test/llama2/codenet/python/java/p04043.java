<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int, input().split())
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```

### Input

```
5 5 7
```

### Output

```
YES
```

### Explanation

```
a,b,c=map(int, input().split())
```

```
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```

### Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (Arrays.sort(new int[]{a,b,c})==Arrays.sort(new int[]{5,5,7})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
</s>
