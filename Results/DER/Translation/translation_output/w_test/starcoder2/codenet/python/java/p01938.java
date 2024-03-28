

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);
            if (Now < Next) {
                // pass
            } else {
                ans += 1;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```

## 1.2. 1000000007

### 1.2.1. Problem

Given an integer N, print the last digit of N!.

### 1.2.2. Constraints

- 1 ≤ N ≤ 10000

### 1.2.3. Input

Input is given from Standard Input in the following format:

```
N
```

### 1.2.4. Output

Print the last digit of N!.

### 1.2.5. Sample Input 1

```
10
```

### 1.2.6. Sample Output 1

```
0
```

### 1.2.7. Sample Input 2

```
10000
```

### 1.2.8. Sample Output 2

```
0
```

### 1.2.9. Sample Input 3

```
1
```

### 1.2.10. Sample Output 3

```
1
```

### 1.2.11. Note

In the first sample, 10! = 3628800, and the last digit of 10! is 0.

In the second sample, 10000! is a 2568-digit number, and the last digit of 10000! is 0.

In the third sample, 1! = 1, and the last digit of 1! is 1.

### 1.2.12. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
            ans %= 10;
        }
        System.out.println(ans);
    }
}
```

## 1.3. 1000000007

### 1.3.1. Problem

Given an integer N, print the last digit of N!.

### 1.3.2. Constraints

- 1 ≤ N ≤ 10000

### 1.3.3. Input

Input is given from Standard Input in the following format:

```
N
```

### 1.3.4. Output

Print the last digit of N!.

### 1.3.5. Sample Input 1

```
10
```

### 1.3.6. Sample Output 1

```
0
```

### 1.3.7. Sample Input 2

```
10000
```

### 1.3.8. Sample Output 2

```
0
```

### 1.3.9. Sample Input 3

```
1
```

### 1.3.10. Sample Output 3

```
1
```

### 1.3.11. Note

In the first sample, 10! = 3628800, and the last digit of 10! is 0.

In the second sample, 10000! is a 2568-digit number, and the last digit of 10000! is 0.

In the third sample, 1! = 1, and the last digit of 1! is 1.

### 1.3.12. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
            ans %= 10;
        }
        System.out.println(ans);
    }
}
```

## 1.4. 1000000007

### 1.4.1. Problem

Given an integer N, print the last digit of N!.

### 1.4.2. Constraints

- 1 ≤ N ≤ 10000

### 1.4.3. Input

Input is given from Standard Input in the following format:

```
N
```

### 1.4.4. Output

Print the last digit of N!.

### 1.4.5. Sample Input 1

```
10
```

### 1.4.6. Sample Output 1

```
0
```

### 1.4.7. Sample Input 2

```
10000
```

### 1.4.8. Sample Output 2

```
0
```

### 1.4.9. Sample Input 3

```
1
```

### 1.4.10. Sample Output 3

```
1
```

### 1.4.11. Note

In the first sample, 10! = 3628800, and the last digit of 10! is 0.

In the second sample, 10000! is a 2568-digit number, and the last digit of 10000! is 0.

In the third sample, 1! = 1, and the last digit of 1! is 1.

### 1.4.12. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
            ans %= 10;
        }
        System.out.println(ans);
    }
}
```


```

### 1.1.10. Sample Output 3

```
1
```

### 1.1.11. Note

In the first sample, 10! = 3628800, and the last digit of 10! is 0.

In the second sample, 10000! is a 2568-digit number, and the last digit of 10000! is 0.

In the third sample, 1! = 1, and the last digit of 1! is 1.

### 1.1.12. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
            ans %= 10;
        }
        System.out.println(ans);
    }
}
```

## 1.2. 1000000007

### 1.2.1. Problem

Given an integer N, print the last digit of N!.

### 1.2.2
