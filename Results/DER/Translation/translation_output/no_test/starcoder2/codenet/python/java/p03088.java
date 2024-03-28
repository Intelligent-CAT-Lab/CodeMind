
```java

```


```

java code:
```java

```
/README.md
# AtCoder-Beginner-Contest-173

## 問題

### A

```

```

java code:
```java

```

### B

```

```

java code:
```java

```

### C

```

```

java code:
```java

```

### D

```

```

java code:
```java

```

### E

```

```

java code:
```java

```

### F

```

```

java code:
```java

```

### G

```/src/main/java/contest/contest173/A.java
package contest.contest173;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1000 - N % 1000;
        if (ans == 1000) {
            ans = 0;
        }
        System.out.println(ans);
    }
}

