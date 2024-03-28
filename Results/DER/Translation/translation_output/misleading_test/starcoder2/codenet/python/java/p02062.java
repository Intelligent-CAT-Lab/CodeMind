

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        List<Character> tokens = new ArrayList<>();
        for (char c : src.toCharArray()) {
            if (c != ' ') {
                tokens.add(c);
            }
        }
        tokens.add(' ');
        int cur = 0;
        int[] ans = parse_formula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse_formula(List<Character> tokens, int cur) {
        return parse_or(tokens, cur);
    }

    public static int[] parse_or(List<Character> tokens, int cur) {
        int[] lhs = parse_and(tokens, cur);
        if (tokens.get(cur) == '|') {
            cur++;
            int[] rhs = parse_or(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_and(List<Character> tokens, int cur) {
        int[] lhs = parse_term(tokens, cur);
        if (tokens.get(cur) == '&') {
            cur++;
            int[] rhs = parse_and(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_term(List<Character> tokens, int cur) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur) == '(') {
            cur++;
            int[] res = parse_or(tokens, cur);
            if (tokens.get(cur) != ')') {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        return null;
    }
}
```

## 2.

### 2.1

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.2

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.3

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.4

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.5

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.6

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.7

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.8

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.9

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.10

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.11

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.12

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.13

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.14

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.15

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.16

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.17

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.18

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.19

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.20

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.21

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.22

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.23

```
def f(x):
    if x == 0:
        return 1
    else:
        return x * f(x - 1)
```

### 2.24

```
def f(x):
    if x == 0:
