
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][N];
        int count = 0;
        for (int s = 1; s <= N; s++) {
            int ng = N - s + 1;
            for (int t = 1; t <= N; t++) {
                if (s >= t || t == ng) {
                    continue;
                }
                edge[s - 1][t - 1] = 1;
                count++;
            }
        }
        System.out.println(count);
        for (int s = 0; s < N; s++) {
            for (int t = 0; t < N; t++) {
                if (edge[s][t] == 1) {
                    System.out.println(s + 1 + " " + (t + 1));
                }
            }
        }
    }
}
```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, print the sum of all the digits of N.

### 2.2. Input

The first line of the input contains a positive integer N.

### 2.3. Output

Print the sum of all the digits of N.

### 2.4. Constraints

1 ≤ N ≤ 10^100000

### 2.5. Sample Input 1

```
123456789
```

### 2.6. Sample Output 1

```
45
```

### 2.7. Sample Input 2

```
1000000007
```

### 2.8. Sample Output 2

```
7
```

### 2.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 3. 1000000007

### 3.1. Problem

Given a positive integer N, print the sum of all the digits of N.

### 3.2. Input

The first line of the input contains a positive integer N.

### 3.3. Output

Print the sum of all the digits of N.

### 3.4. Constraints

1 ≤ N ≤ 10^100000

### 3.5. Sample Input 1

```
123456789
```

### 3.6. Sample Output 1

```
45
```

### 3.7. Sample Input 2

```
1000000007
```

### 3.8. Sample Output 2

```
7
```

### 3.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 4. 1000000007

### 4.1. Problem

Given a positive integer N, print the sum of all the digits of N.

### 4.2. Input

The first line of the input contains a positive integer N.

### 4.3. Output

Print the sum of all the digits of N.

### 4.4. Constraints

1 ≤ N ≤ 10^100000

### 4.5. Sample Input 1

```
123456789
```

### 4.6. Sample Output 1

```
45
```

### 4.7. Sample Input 2

```
1000000007
```

### 4.8. Sample Output 2

```
7
```

### 4.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```


### 2.1. Problem

Given a positive integer N, print the sum of all the digits of N.

### 2.2. Input

The first line of the input contains a positive integer N.

### 2.3. Output

Print the sum of all the digits of N.

### 2.4. Constraints

1 ≤ N ≤ 10^100000

### 2.5. Sample Input 1

```
123456789
```

### 2.6. Sample Output 1

```
45
```

### 2.7. Sample Input 2

```
1000000007
```

### 2.8. Sample Output 2

```
7
```

### 2.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 3. 1000000007

### 3.1. Problem

Given a positive integer N, print the sum of all the digits of N.

### 3.2. Input

The first line of the input contains a positive integer N.

### 3.3. Output

Print the sum of all the digits of N.

### 3.4. Constraints

1 ≤ N ≤ 10^100000

### 3.5. Sample Input 1

```
123456789
```

### 3.6. Sample Output 1

```
45
```

### 3.7. Sample Input 2

```
1000000007
```

### 3.8. Sample Output 2

```
7
```

### 3.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum += N.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 4. 1000000007

### 4.1. Problem


