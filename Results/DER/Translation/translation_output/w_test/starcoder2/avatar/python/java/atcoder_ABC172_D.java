

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```


```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
       
