

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = (x + n * b) % 1000000007;
        System.out.println(ans);
    }
}
```

## 2. 1000000007

```

Given a number N, find the remainder when N is divided by 1000000007.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the remainder when N is divided by 1000000007.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
10
11

Sample Output:
10
11

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    print(n % 1000000007)

```

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n % 1000000007);
        }
    }
}

```

## 3. Sum of Digits

```

Given a number N, find the sum of the digits of N.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the sum of the digits of N.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
12345
10203

Sample Output:
15
9

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    ans = 0
    while n > 0:
        ans += n % 10
        n //= 10
    print(ans)

```

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans = 0;
            while (n > 0) {
                ans += n % 10;
                n /= 10;
            }
            System.out.println(ans);
        }
    }
}

```

## 4. Sum of Digits (Hard)

```

Given a number N, find the sum of the digits of N.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the sum of the digits of N.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
12345
10203

Sample Output:
15
9

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    ans = 0
    while n > 0:
        ans += n % 10
        n //= 10
    print(ans)

```

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans = 0;
            while (n > 0) {
                ans += n % 10;
                n /= 10;
            }
            System.out.println(ans);
        }
    }
}

```

## 5. Sum of Digits (Hard)

```

Given a number N, find the sum of the digits of N.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the sum of the digits of N.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
12345
10203

Sample Output:
15
9

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    ans = 0
    while n > 0:
        ans += n % 10
        n //= 10
    print(ans)

```

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans = 0;
            while (n > 0) {
                ans += n % 10;
                n /= 10;
            }
            System.out.println(ans);
        }
    }
}

```

## 6. Sum of Digits (Hard)

```

Given a number N, find the sum of the digits of N.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the sum of the digits of N.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
12345
10203

Sample Output:
15
9

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    ans = 0
    while n > 0:
        ans += n % 10
        n //= 10
    print(ans)

```

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans = 0;
            while (n > 0) {
                ans += n % 10;
                n /= 10;
            }
            System.out.println(ans);
        }
    }
}

```

## 7. Sum of Digits (Hard)

```

Given a number N, find the sum of the digits of N.

Input:
The first line contains T, the number of test cases.
Each test case contains a number N.

Output:
For each test case, print the sum of the digits of N.

Constraints:
1 <= T <= 100000
1 <= N <= 1000000000

Sample Input:
2
12345
10203

Sample Output:
15
9

```

```python

t = int(input())
for i in range(t):
    n = int(input())
    ans = 0
    while
