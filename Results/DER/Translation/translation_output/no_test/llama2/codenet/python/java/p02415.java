<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.swapcase())

```

### Input

```
Hello
```

### Output

```
HELLO
```

### Explanation

```
s = input()
```

```
print(s.swapcase())
```

### Hint

```
s = input()
```

```
print(s.swapcase())
```

### Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
    }
}
```
</s>
