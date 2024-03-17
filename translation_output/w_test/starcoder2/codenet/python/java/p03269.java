
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (Math.pow(2, d) <= l) {
            d++;
        }
        d--;
        int n = d + 1;
        int m = 2 * d;
        int[][] ans = new int[m][3];
        for (int i = 0; i < m; i++) {
            ans[i][0] = 0;
            ans[i][1] = 0;
            ans[i][2] = 0;
        }
        for (int i = 1; i < n; i++) {
            ans[i - 1][0] = i;
            ans[i - 1][1] = i + 1;
            ans[i - 1][2] = (int) Math.pow(2, i - 1);
            ans[i + d - 1][0] = i;
            ans[i + d - 1][1] = i + 1;
            ans[i + d - 1][2] = 0;
        }
        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans[m][0] = i;
                    ans[m][1] = n;
                    ans[m][2] = (int) (l - Math.pow(2, i - 1));
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }
        System.out.println(n + " " + m);
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 4. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 5. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 6. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 7. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 8. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 9. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(1000000007)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```


