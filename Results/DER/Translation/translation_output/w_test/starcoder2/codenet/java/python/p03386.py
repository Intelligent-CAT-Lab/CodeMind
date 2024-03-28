

```

a,b,k = map(int,input().split())

set = set()
cnt = 0
for i in range(a,b+1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)
cnt = 0
for i in range(b,a-1,-1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

for ans in set:
    print(ans)

```

## 4. 1000000007

```

Given a number n, find the last digit of n! (n factorial).

Input
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output
For each test case, print the last digit of n!.

Constraints
1 ≤ T ≤ 100000
1 ≤ n ≤ 1000000000

Sample Input
3
3
6
31

Sample Output
6
6
8

```

```

import java.util.Scanner;

public class p03387 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (ans * i) % 10;
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}

```

```

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    ans = 1
    for i in range(1,n+1):
        ans = (ans * i) % 10
    print(ans)

```

## 5. 1000000007

```

Given a number n, find the last digit of n! (n factorial).

Input
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output
For each test case, print the last digit of n!.

Constraints
1 ≤ T ≤ 100000
1 ≤ n ≤ 1000000000

Sample Input
3
3
6
31

Sample Output
6
6
8

```

```

import java.util.Scanner;

public class p03387 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (ans * i) % 10;
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}

```

```

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    ans = 1
    for i in range(1,n+1):
        ans = (ans * i) % 10
    print(ans)

```

## 6. 1000000007

```

Given a number n, find the last digit of n! (n factorial).

Input
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output
For each test case, print the last digit of n!.

Constraints
1 ≤ T ≤ 100000
1 ≤ n ≤ 1000000000

Sample Input
3
3
6
31

Sample Output
6
6
8

```

```

import java.util.Scanner;

public class p03387 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (ans * i) % 10;
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}

```

```

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    ans = 1
    for i in range(1,n+1):
        ans = (ans * i) % 10
    print(ans)

```

## 7. 1000000007

```

Given a number n, find the last digit of n! (n factorial).

Input
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output
For each test case, print the last digit of n!.

Constraints
1 ≤ T ≤ 100000
1 ≤ n ≤ 1000000000

Sample Input
3
3
6
31

Sample Output
6
6
8

```

```

import java.util.Scanner;

public class p03387 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (ans * i) % 10;
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}

```

```

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    ans = 1
    for i in range(1,n+1):
        ans = (ans * i) % 10
    print(ans)

```

## 8. 1000000007

```

Given a number n, find the last digit of n! (n factorial).

Input
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output
For each test case, print the last digit of n!.

Constraints
1 ≤ T ≤ 100000
1 ≤ n ≤ 1000000000

Sample Input
3
3
6
31

Sample Output
6
6
8

```

```

import java.util.Scanner;

public class p03387 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner
