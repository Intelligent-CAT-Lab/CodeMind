

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = make_prime_nums(2000);
        int[] ans = new int[n];
        int i = 0;
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans[i] = pi;
                i++;
            }
            if (i == n) {
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(ans[j] + " ");
        }
    }

    public static int[] make_prime_nums(int n) {
        int[] prime_nums = new int[n];
        prime_nums[0] = 2;
        int i = 3;
        int j = 1;
        while (i <= n) {
            for (int p : prime_nums) {
                if (p >= Math.sqrt(i) + 1) {
                    prime_nums[j] = i;
                    j++;
                    break;
                }
                if (i % p == 0) {
                    break;
                }
            }
            i++;
        }
        return prime_nums;
    }
}
```

## 1.2. 1000000007

### 1.2.1. 問題文

1000000007を出力してください。

### 1.2.2. 制約

- なし

### 1.2.3. 入力

- なし

### 1.2.4. 出力

- 1000000007を出力してください。

### 1.2.5. 入力例

```

```

### 1.2.6. 出力例

```
1000000007
```

### 1.2.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.3. 1000000007

### 1.3.1. 問題文

1000000007を出力してください。

### 1.3.2. 制約

- なし

### 1.3.3. 入力

- なし

### 1.3.4. 出力

- 1000000007を出力してください。

### 1.3.5. 入力例

```

```

### 1.3.6. 出力例

```
1000000007
```

### 1.3.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.4. 1000000007

### 1.4.1. 問題文

1000000007を出力してください。

### 1.4.2. 制約

- なし

### 1.4.3. 入力

- なし

### 1.4.4. 出力

- 1000000007を出力してください。

### 1.4.5. 入力例

```

```

### 1.4.6. 出力例

```
1000000007
```

### 1.4.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.5. 1000000007

### 1.5.1. 問題文

1000000007を出力してください。

### 1.5.2. 制約

- なし

### 1.5.3. 入力

- なし

### 1.5.4. 出力

- 1000000007を出力してください。

### 1.5.5. 入力例

```

```

### 1.5.6. 出力例

```
1000000007
```

### 1.5.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.6. 1000000007

### 1.6.1. 問題文

1000000007を出力してください。

### 1.6.2. 制約

- なし

### 1.6.3. 入力

- なし

### 1.6.4. 出力

- 1000000007を出力してください。

### 1.6.5. 入力例

```

```

### 1.6.6. 出力例

```
1000000007
```

### 1.6.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.7. 1000000007

### 1.7.1. 問題文

1000000007を出力してください。

### 1.7.2. 制約

- なし

### 1.7.3. 入力

- なし

### 1.7.4. 出力

- 1000000007を出力してください。

### 1.7.5. 入力例

```

```

### 1.7.6. 出力例

```
1000000007
```

### 1.7.7. 解答

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(
