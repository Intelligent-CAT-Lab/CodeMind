

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
                    if (i == n - 1 || s.charAt(i + 1) == 'L') {
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

## 2. 1000000007

### 2.1. Problem

1000000007 is a prime number.

### 2.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 3. 1000000007

### 3.1. Problem

1000000007 is a prime number.

### 3.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 4. 1000000007

### 4.1. Problem

1000000007 is a prime number.

### 4.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 5. 1000000007

### 5.1. Problem

1000000007 is a prime number.

### 5.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 6. 1000000007

### 6.1. Problem

1000000007 is a prime number.

### 6.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 7. 1000000007

### 7.1. Problem

1000000007 is a prime number.

### 7.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 8. 1000000007

### 8.1. Problem

1000000007 is a prime number.

### 8.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 9. 1000000007

### 9.1. Problem

1000000007 is a prime number.

### 9.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 10. 1000000007

### 10.1. Problem

1000000007 is a prime number.

### 10.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007

### 11.1. Problem

1000000007 is a prime number.

### 11.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007

### 12.1. Problem

1000000007 is a prime number.

### 12.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007

### 13.1. Problem

1000000007 is a prime number.

### 13.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007

### 14.1. Problem

1000000007 is a prime number.

### 14.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007

### 15.1. Problem

1000000007 is a prime number.

### 15.2. Solution

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 16. 1000000007

### 16.1. Problem

1000000007 is a prime number.

### 1
