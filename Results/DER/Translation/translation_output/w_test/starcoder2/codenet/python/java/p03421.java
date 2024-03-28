

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n < a + (b - 1) || n > a + (b - 1) * a) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            return;
        }
        int loop = n / (b - 1);
        int option = n % (b - 1);
        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop + 1; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option--;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
    }
}
```

## 2. 1000000007

Given a number n, find the number of ways to write n as the sum of two or more positive integers.

Input:

The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains a single integer n.

Output:

For each test case, print a single line containing one integer — the number of ways to write n as the sum of two or more positive integers.

Constraints:

1 <= T <= 100000

1 <= n <= 1000000000

Sample Input:

3

4

5

6

Sample Output:

2

3

5

Explanation:

Test case 1: 4 can be written as 1+1+1+1 or 2+2.

Test case 2: 5 can be written as 1+1+1+1+1, 1+1+1+2 or 2+3.

Test case 3: 6 can be written as 1+1+1+1+1+1, 1+1+1+1+2, 1+1+1+3, 1+2+2, 2+2+2.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= n / 2; i++) {
                ans = (ans + n - i + 1) % 1000000007;
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000007

Given a number n, find the number of ways to write n as the sum of two or more positive integers.

Input:

The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains a single integer n.

Output:

For each test case, print a single line containing one integer — the number of ways to write n as the sum of two or more positive integers.

Constraints:

1 <= T <= 100000

1 <= n <= 1000000000

Sample Input:

3

4

5

6

Sample Output:

2

3

5

Explanation:

Test case 1: 4 can be written as 1+1+1+1 or 2+2.

Test case 2: 5 can be written as 1+1+1+1+1, 1+1+1+2 or 2+3.

Test case 3: 6 can be written as 1+1+1+1+1+1, 1+1+1+1+2, 1+1+1+3, 1+2+2, 2+2+2.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= n / 2; i++) {
                ans = (ans + n - i + 1) % 1000000007;
            }
            System.out.println(ans);
        }
    }
}
```

## 4. 1000000007

Given a number n, find the number of ways to write n as the sum of two or more positive integers.

Input:

The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains a single integer n.

Output:

For each test case, print a single line containing one integer — the number of ways to write n as the sum of two or more positive integers.

Constraints:

1 <= T <= 100000

1 <= n <= 1000000000

Sample Input:

3

4

5

6

Sample Output:

2

3

5

Explanation:

Test case 1: 4 can be written as 1+1+1+1 or 2+2.

Test case 2: 5 can be written as 1+1+1+1+1, 1+1+1+2 or 2+3.

Test case 3: 6 can be written as 1+1+1+1+1+1, 1+1+1+1+2, 1+1+1+3, 1+2+2, 2+2+2.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= n / 2; i++) {
                ans = (ans + n - i + 1) % 1000000007;
            }
            System.out.println(ans);
        }
    }
}
```

## 5. 1000000007

Given a number n, find the number of ways to write n as the sum of two or more positive integers.

Input:

The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains a single integer n.

Output:

For each test case, print a single line containing one integer — the number of ways to write n as the sum of two or more positive integers.

Constraints:

1 <= T <= 10000
