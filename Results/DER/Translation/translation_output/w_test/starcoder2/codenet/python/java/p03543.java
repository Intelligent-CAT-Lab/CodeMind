

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        char[] a = N.toCharArray();
        if (a[0] == a[1] && a[1] == a[2] || a[1] == a[2] && a[2] == a[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
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
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < N; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/01_max_number.md
# Max number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    max = a[0]
    for i in range(1, N):
        max = a[i]/02_sum_of_array.md
# Sum of array

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
15


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    sum = 0
    for i in range(N):
        sum += a[i]
    print(sum)

if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```
/03_sum_of_even_numbers.md
# Sum of even numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
6


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    sum = 0
    for i in range(N):
        if a[i] % 2 == 0:
            sum += a[i]
    print(sum)

if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
      = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```
  int sum   }
}
```
/04_sum_of_odd_numbers.md
# Sum of odd numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
9


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    sum = 0
    for i in range(N):
        if a[i] % 2 == 1:
            sum += a[i]
    print(sum)

if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 1) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of odd numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
9


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    sum = 0
    for i in range(N):
        if a[i] % 2 == 1:
            sum += a[i]
    print(sum)

if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 1) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
```

# Sum of odd numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
9


```
def main():
    N = int(input())
    a = list(map(int, input().split()))

    sum = 0
    for i in range(N):
        if a[i] % 2 == 1:
            sum += a[i]
    print(sum)

if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 1) {
                sum += a[i];
            }
        }
        System.out.println(sum);
  /05 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
