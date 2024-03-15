<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,r = [int(x) for x in input().split()]

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```

### Input

```
5 10
```

### Output

```
100
```

### Explanation

```
n = 5
r = 10

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        n = sc.nextInt();
        r = sc.nextInt();

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```
</s>
