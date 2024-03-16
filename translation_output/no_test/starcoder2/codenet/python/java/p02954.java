
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc++;
                    if (i + 1 < n && s.charAt(i + 1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i + 1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (s.charAt(i) == 'L') {
                    lc++;
                    if (i == n - 1 || s.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

## 10. 1000000007

### 10.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 10.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007 (2)

### 11.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 11.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007 (3)

### 12.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 12.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007 (4)

### 13.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 13.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007 (5)

### 14.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 14.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007 (6)

### 15.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 15.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 16. 1000000007 (7)

### 16.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 16.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 17. 1000000007 (8)

### 17.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 17.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 18. 1000000007 (9)

### 18.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 18.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 19. 1000000007 (10)

### 19.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 19.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 20. 1000000007 (11)

### 20.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 20.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 21. 1000000007 (12)

### 21.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 21.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 22. 1000000007 (13)

### 22.1. Problem

1000000007 (10^9 + 7) is a prime number.

### 22.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

##
