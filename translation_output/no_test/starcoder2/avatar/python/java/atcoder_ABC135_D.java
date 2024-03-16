
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String s1 = s[0];
        int n = s1.length();
        int now = 1;
        int[] amari = new int[n];
        for (int i = 0; i < n; i++) {
            amari[i] = now;
            now = (now * 10) % 13;
        }
        int[][] ans = new int[2][13];
        ans[0][0] = 1;
        ans[1][0] = 1;
        for (int i = 0; i < n; i++) {
            now = s1.charAt(n - 1 - i) - '0';
            ans[(i + 1) % 2] = new int[13];
            if (now == -1) {
                for (int k = 0; k < 10; k++) {
                    int plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[(i + 1) % 2][(j + plus) % 13] += ans[i % 2][j];
                        ans[(i + 1) % 2][(j + plus) % 13] %= 1000000007;
                    }
                }
            } else {
                int plus = (amari[i] * now) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[(i + 1) % 2][(j + plus) % 13] = ans[i % 2][j];
                }
            }
        }
        System.out.println(ans[(n - 1) % 2][5]);
    }
}
```

## 10. 1000000007

### 10.1. Problem

1000000007を出力してください。

### 10.2. Constraints

* なし

### 10.3. Input

* なし

### 10.4. Output

* 1000000007を出力してください。

### 10.5. Sample Input

```

```

### 10.6. Sample Output

```
1000000007
```

### 10.7. Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007

### 11.1. Problem

1000000007を出力してください。

### 11.2. Constraints

* なし

### 11.3. Input

* なし

### 11.4. Output

* 1000000007を出力してください。

### 11.5. Sample Input

```

```

### 11.6. Sample Output

```
1000000007
```

### 11.7. Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007

### 12.1. Problem

1000000007を出力してください。

### 12.2. Constraints

* なし

### 12.3. Input

* なし

### 12.4. Output

* 1000000007を出力してください。

### 12.5. Sample Input

```

```

### 12.6. Sample Output

```
1000000007
```

### 12.7. Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007

### 13.1. Problem

1000000007を出力してください。

### 13.2. Constraints

* なし

### 13.3. Input

* なし

### 13.4. Output

* 1000000007を出力してください。

### 13.5. Sample Input

```

```

### 13.6. Sample Output

```
1000000007
```

### 13.7. Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007

### 14.1. Problem

1000000007を出力してください。

### 14.2. Constraints

* なし

### 14.3. Input

* なし

### 14.4. Output

* 1000000007を出力してください。

### 14.5. Sample Input

```

```

### 14.6. Sample Output

```
1000000007
```

### 14.7. Java Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007

### 15.1. Problem

1000000007を出力してください。

### 15.2. Constraints

* なし

### 15.3. Input

* なし

### 15.4. Output

* 1000000007を出力してください。

### 15.5. Sample Input

```

```

### 15.6. Sample Output

```
1000000007
```

