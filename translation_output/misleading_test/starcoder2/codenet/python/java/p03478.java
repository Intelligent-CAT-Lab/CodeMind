
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            String n_i = String.valueOf(i);
            for (int j = 0; j < n_i.length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(n_i.charAt(j)));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            String n_i = String.valueOf(i);
            for (int j = 0; j < n_i.length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(n_i.charAt(j)));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
/java/001.md
# 001

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
29

```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
    n_orders_sum = 0
    for n_order_i in str(n_i):
        n_orders_sum += int(n_order_i)
    if a <= n_orders_sum and n_orders_sum <= b:
        sum += n_i
print(sum)/java/002.md
# 002

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10

```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
    n_orders_sum = 0
    for n_order_i in str(n_i):
        n_orders_sum += int(n_order_i)
    if a <= n_orders_sum and n_orders_sum <= b:
        sum += n_i
print(sum)

```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            String n_i = String.valueOf(i);
            for (int j = 0; j < n_i.length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(n_i.charAt(j)));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

# 003

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10

```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
    n_orders_sum = 0
    for n_order_i in str(n_i):
        n_orders_sum += int(n_order_i)
    if a <= n_orders_sum and n_orders_sum <= b:
        sum += n_i
print(sum)

```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            String n_i = String.valueOf(i);
            for (int j = 0; j < n_i.length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(n_i.charAt(j)));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

# 004

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10

```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
    n_orders_sum = 0
    for n_order_i in str(n_i):
        n_orders_sum += int(n_order_i)
    if a <= n_orders_sum and n_orders_sum <= b:
        sum += n_i
print(sum)

```

java code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            String n_i = String.valueOf(i);
            for (int j = 0; j < n_i.length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(n_i.charAt(j)));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

# 005

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10

```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
    n_orders_sum = 0
    for n_order_i in str(n_i):
        n_orders_sum += int(n_order_i)
    if a <= n_orders_sum and n_orders_sum <= b:
        sum += n_i
print(
