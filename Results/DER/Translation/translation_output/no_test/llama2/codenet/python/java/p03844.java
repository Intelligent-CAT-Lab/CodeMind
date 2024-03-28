<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)

```

### Input

```
1 2 +
```

### Output

```
3
```

### Explanation

```
A = 1
B = 2
s = '+'
```

### Hint

```
A = int(A)
B = int(B)
```

### Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String s = sc.nextLine();
        String B = sc.nextLine();
        int A_int = Integer.parseInt(A);
        int B_int = Integer.parseInt(B);
        if (s.equals("+")) {
            System.out.println(A_int + B_int);
        } else if (s.equals("-")) {
            System.out.println(A_int - B_int);
        }
    }
}
```
</s>
