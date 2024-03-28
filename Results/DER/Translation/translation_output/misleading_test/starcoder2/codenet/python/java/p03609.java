
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(x-t > 0 ? x-t : 0);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-max-of-array.md
# Max of array

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
5
```

```
n = int(input())
a = list(map(int, input().split()))
max = a[0]
for i in range(1, n):
    if a[i] > max:
        max = a[i]
print(max)/02-sum-of-array.md
# Sum of array

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().splittatic void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```
()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public s

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
    }
}
```
/03-average-of-array.md
# Average of array

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
3
```

```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum / n)
```/04-sum-of-array-with-index.md
# Sum of array with index

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i] * (i + 1)
print(sum)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * (i + 1);
        }
        System.out.println(sum);
    }
}
```

# Sum of array with index (2)

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i] * (n - i)
print(sum)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * (n - i);
        }
        System.out.println(sum);
    }
}
```

# Sum of array with index (3)

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i] * (i + 1) * (n - i)
print(sum)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * (i + 1) * (n - i);
        }
        System.out.println(sum);
    }
}
```

# Sum of array with index (4)

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i] * (i + 1) * (i + 1)
print(sum)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int
