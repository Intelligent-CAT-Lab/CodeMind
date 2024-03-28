

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

## 2. 1000

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
# -*- coding: utf-8 -*-


def main():
    a, b, c = list(map(int, input().split()))

    print(a + b + c)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b + c);
    }
}
```

## 3. 1001

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1


```
# -*- coding: utf-8 -*-


def main():
    a, b = list(map(int, input().split()))

    print(a - b)


if __name__ == '__main__':
    main()

```

java code:

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

## 4. 1008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
0.5000000000


```
# -*- coding: utf-8 -*-


def main():
    a, b = list(map(int, input().split()))

    print(a / b)


if __name__ == '__main__':
    main()

```

java code:

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

## 5. 10869

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1 2 3 4 5


```
# -*- coding: utf-8 -*-


def main():
    a, b = list(map(int, input().split()))

    print(a + b)
    print(a - b)
    print(a * b)
    print(a // b)
    print(a % b)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

## 6. 10430

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8 4

Expected output:
1 1 1 1 5 1 3 3 2 1 1 4 1 5 1


```
# -*- coding: utf-8 -*-


def main():
    a, b, c = list(map(int, input().split()))

    print((a + b) % c)
    print(((a % c) + (b % c)) % c)
    print((a * b) % c)
    print(((a % c) * (b % c)) % c)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
```

## 7. 2588

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1 2 3 4 5


```
# -*- coding: utf-8 -*-


def main():
    a = int(input())
    b = int(input())

    print(a * (b % 10))
    print(a * (b // 10 % 10))
    print(a * (b // 100))
    print(a * b)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * (b % 10));
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
```

## 8. 10998

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
# -*- coding: utf-8 -*-


def main():
    a, b = list(map(int, input().split()))

    print(a * b)


if __name__ == '__main__':
    main()

```

java code:

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

## 9. 1009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1


```
# -*- coding: utf-8 -*-


def main():
    a, b = list(map(int, input().split()))

    print(pow(a, b, 10))


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
