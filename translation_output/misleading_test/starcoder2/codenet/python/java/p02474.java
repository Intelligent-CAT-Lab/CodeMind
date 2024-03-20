

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(a[0]) * Integer.parseInt(a[1]));
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
/java/001-max-of-n-numbers.md
# Max of N numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5

```
n=int(raw_input())
a=raw_input().split()
max=int(a[0])
for i in range(1,n):
    if int(a[i])>max:
        max=int(a[i])
print(max)

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
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```
/java/002-sum-of-n-numbers.md
# Sum of N numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
15

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    sum+=int(a[i])
print(sum)/java/003-sum-of-even-numbers.md
# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    if int(a[i])%2==0:
        sum+=int(a[i])
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
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    if int(a[i])%2==0:
        sum+=int(a[i])
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
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    if int(a[i])%2==0:
        sum+=int(a[i])
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
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    if int(a[i])%2==0:
        sum+=int(a[i])
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
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6

```
n=int(raw_input())
a=raw_input().split()
sum=0
for i in range(0,n):
    if int(a[i])%2==0:
        sum+=int(a[i])
print(sum)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =
