
```java
import java.util.*;
import java.io.*;

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

## 10. 1000000007

### 10.1. 問題文

1000000007を出力してください。

### 10.2. 制約

- なし

### 10.3. 入力

- なし

### 10.4. 出力

- 1000000007を出力してください。

### 10.5. 入力例

```

```

### 10.6. 出力例

```
1000000007
```

### 10.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007

### 11.1. 問題文

1000000007を出力してください。

### 11.2. 制約

- なし

### 11.3. 入力

- なし

### 11.4. 出力

- 1000000007を出力してください。

### 11.5. 入力例

```

```

### 11.6. 出力例

```
1000000007
```

### 11.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007

### 12.1. 問題文

1000000007を出力してください。

### 12.2. 制約

- なし

### 12.3. 入力

- なし

### 12.4. 出力

- 1000000007を出力してください。

### 12.5. 入力例

```

```

### 12.6. 出力例

```
1000000007
```

### 12.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007

### 13.1. 問題文

1000000007を出力してください。

### 13.2. 制約

- なし

### 13.3. 入力

- なし

### 13.4. 出力

- 1000000007を出力してください。

### 13.5. 入力例

```

```

### 13.6. 出力例

```
1000000007
```

### 13.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007

### 14.1. 問題文

1000000007を出力してください。

### 14.2. 制約

- なし

### 14.3. 入力

- なし

### 14.4. 出力

- 1000000007を出力してください。

### 14.5. 入力例

```

```

### 14.6. 出力例

```
1000000007
```

### 14.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007

### 15.1. 問題文

1000000007を出力してください。

### 15.2. 制約

- なし

### 15.3. 入力

- なし

### 15.4. 出力

- 1000000007を出力してください。

### 15.5. 入力例

```

```

### 15.6. 出力例

```
1000000007
```

### 15.7. 解法

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(10
