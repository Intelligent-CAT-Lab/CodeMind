
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;

        long[] factorial = new long[H+W+1];
        long[] inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i < H+W+1; i++) {
            factorial[i] = factorial[i-1] * i % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2, MOD);
        }

        long answer = 0;
        for (int i = B+1; i < W+1; i++) {
            answer += f(H-A, i) * f(A, W-i+1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long f(int h, int w) {
        return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD;
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }
}
```

## 10. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 11. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 12. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 13. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 14. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 15. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 16. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 17. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 18. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 19. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 20. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 21. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 22. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 23. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 24. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 25. 1000000007

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        System.out.println(MOD);
    }
}
```

## 26. 1000000007

```java
import java
