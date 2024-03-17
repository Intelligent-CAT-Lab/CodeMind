

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (int) Math.ceil((K - A) / (A - B)) * 2);
        }
    }
}
```

## 2. 1000000007

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

Input:
The first line contains an integer T, the number of test cases.
Each test case consists of one line containing an integer N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^9

Sample Input:
3
4
5
6

Sample Output:
1
2
3

Explanation:
Test case 1: 4 can be written as 1+3.
Test case 2: 5 can be written as 1+4 or 2+3.
Test case 3: 6 can be written as 1+5, 2+4 or 3+3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if ((N - j * (j - 1) / 2) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 3. 1000000009

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

Input:
The first line contains an integer T, the number of test cases.
Each test case consists of one line containing an integer N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^9

Sample Input:
3
4
5
6

Sample Output:
1
2
3

Explanation:
Test case 1: 4 can be written as 1+3.
Test case 2: 5 can be written as 1+4 or 2+3.
Test case 3: 6 can be written as 1+5, 2+4 or 3+3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if ((N - j * (j - 1) / 2) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 4. 1000000011

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

Input:
The first line contains an integer T, the number of test cases.
Each test case consists of one line containing an integer N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^9

Sample Input:
3
4
5
6

Sample Output:
1
2
3

Explanation:
Test case 1: 4 can be written as 1+3.
Test case 2: 5 can be written as 1+4 or 2+3.
Test case 3: 6 can be written as 1+5, 2+4 or 3+3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if ((N - j * (j - 1) / 2) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 5. 1000000013

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

Input:
The first line contains an integer T, the number of test cases.
Each test case consists of one line containing an integer N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^9

Sample Input:
3
4
5
6

Sample Output:
1
2
3

Explanation:
Test case 1: 4 can be written as 1+3.
Test case 2: 5 can be written as 1+4 or 2+3.
Test case 3: 6 can be written as 1+5, 2+4 or 3+3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if ((N - j * (j - 1) / 2) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 6. 1000000015

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

Input:
The first line contains an integer T, the number of test cases.
Each test case consists of one line containing an integer N.

Output:
For each test case, print the answer in a new line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^9

Sample Input:
3
4
5
6

Sample Output:
1
2
3

Explanation:
Test case 1: 4 can be written as 1+3.
Test case 2: 5 can be written as 1+4 or 2+3.
Test case 3: 6 can be written as 1+5, 2+4 or 3+3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if ((N - j * (j - 1) / 2) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

##
