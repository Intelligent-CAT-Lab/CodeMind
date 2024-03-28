
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = "";
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

## 2. 1000

Write a program that reads an integer $a$ and prints $3a+1$.

### Input

The input is given in the following format:

```
a
```

### Output

Print $3a+1$.

### Constraints

- $1 \leq a \leq 100$

### Sample Input 1

```
10
```

### Sample Output 1

```
31
```

### Sample Input 2

```
1
```

### Sample Output 2

```
4
```

### Sample Input 3

```
100
```

### Sample Output 3

```
301
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(3 * a + 1);
    }
}
```

## 3. 1001

Write a program that reads an integer $a$ and prints $a-1$.

### Input

The input is given in the following format:

```
a
```

### Output

Print $a-1$.

### Constraints

- $1 \leq a \leq 100$

### Sample Input 1

```
10
```

### Sample Output 1

```
9
```

### Sample Input 2

```
1
```

### Sample Output 2

```
0
```

### Sample Input 3

```
100
```

### Sample Output 3

```
99
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a - 1);
    }
}
```

## 4. 1002

Write a program that reads two integers $a$ and $b$ and prints $a+b$.

### Input

The input is given in the following format:

```
a b
```

### Output

Print $a+b$.

### Constraints

- $1 \leq a, b \leq 100$

### Sample Input 1

```
10 20
```

### Sample Output 1

```
30
```

### Sample Input 2

```
1 1
```

### Sample Output 2

```
2
```

### Sample Input 3

```
100 100
```

### Sample Output 3

```
200
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 5. 1003

Write a program that reads two integers $a$ and $b$ and prints $a-b$.

### Input

The input is given in the following format:

```
a b
```

### Output

Print $a-b$.

### Constraints

- $1 \leq a, b \leq 100$

### Sample Input 1

```
10 20
```

### Sample Output 1

```
-10
```

### Sample Input 2

```
1 1
```

### Sample Output 2

```
0
```

### Sample Input 3

```
100 100
```

### Sample Output 3

```
0
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

## 6. 1004

Write a program that reads two integers $a$ and $b$ and prints $a \times b$.

### Input

The input is given in the following format:

```
a b
```

### Output

Print $a \times b$.

### Constraints

- $1 \leq a, b \leq 100$

### Sample Input 1

```
10 20
```

### Sample Output 1

```
200
```

### Sample Input 2

```
1 1
```

### Sample Output 2

```
1
```

### Sample Input 3

```
100 100
```

### Sample Output 3

```
10000
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

## 7. 1005

Write a program that reads two integers $a$ and $b$ and prints $a/b$.

### Input

The input is given in the following format:

```
a b
```

### Output

Print $a/b$.

### Constraints

- $1 \leq a, b \leq 100$

### Sample Input 1

```
10 20
```

### Sample Output 1

```
0
```

### Sample Input 2

```
1 1
```

### Sample Output 2

```
1
```

### Sample Input 3

```
100 100
```

### Sample Output 3

```
1
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

## 8. 1006

Write a program that reads two integers $a$ and $b$ and prints $a \mod b$.

### Input

The input is given in the following format:

```
a b
```

### Output

Print $a \mod b$.

### Constraints

- $1 \leq a, b \leq 100$

### Sample Input 1

```
10 20
```

### Sample Output 1

```
10
```

### Sample Input 2

```
1 1
```

### Sample Output 2

```
0
```

### Sample Input 3

```
100 100
```

### Sample Output 3

```
0
```

### Solution

```java
import java.util
