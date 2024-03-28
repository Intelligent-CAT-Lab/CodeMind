

```java
import java.util.*;

public class DSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    public static long solve(int n) {
        long soFar = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            soFar += d * i;
        }
        return soFar;
    }

    public static int divCount(int n) {
        boolean[] hh = new boolean[n + 1];
        Arrays.fill(hh, true);
        int p = 2;
        while (p * p < n) {
            if (hh[p]) {
                for (int i = p * 2; i < n; i += p) {
                    hh[i] = false;
                }
            }
            p++;
        }
        int total = 1;
        for (int p1 = 2; p1 <= n; p1++) {
            if (hh[p1]) {
                int count = 0;
                if (n % p1 == 0) {
                    while (n % p1 == 0) {
                        n /= p1;
                        count++;
                    }
                    total *= (count + 1);
                }
            }
        }
        return total;
    }
}

```

## E. Sum of Divisors

### Problem

Given an integer n, find the sum of all divisors of n.

### Input

The first line of the input contains a single integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

Each test case consists of one line containing one integer n (1≤n≤1012).

### Output

For each test case, print the sum of all divisors of n.

### Example

input:

```
4
1
2
3
4
```

output:

```
1
3
4
7
```

### Note

The sum of divisors of 1 is 1.

The sum of divisors of 2 is 1+2=3.

The sum of divisors of 3 is 1+3=4.

The sum of divisors of 4 is 1+2+4=7.

### Solution

```java
import java.util.*;

public class ESumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }

    public static long solve(long n) {
        long soFar = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                soFar += i;
                if (i * i != n) {
                    soFar += n / i;
                }
            }
        }
        return soFar;
    }
}

```

## F. Sum of Divisors

### Problem

Given an integer n, find the sum of all divisors of n.

### Input

The first line of the input contains a single integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

Each test case consists of one line containing one integer n (1≤n≤1012).

### Output

For each test case, print the sum of all divisors of n.

### Example

input:

```
4
1
2
3
4
```

output:

```
1
3
4
7
```

### Note

The sum of divisors of 1 is 1.

The sum of divisors of 2 is 1+2=3.

The sum of divisors of 3 is 1+3=4.

The sum of divisors of 4 is 1+2+4=7.

### Solution

```java
import java.util.*;

public class FSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }

    public static long solve(long n) {
        long soFar = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                soFar += i;
                if (i * i != n) {
                    soFar += n / i;
                }
            }
        }
        return soFar;
    }
}

```

## G. Sum of Divisors

### Problem

Given an integer n, find the sum of all divisors of n.

### Input

The first line of the input contains a single integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

Each test case consists of one line containing one integer n (1≤n≤1012).

### Output

For each test case, print the sum of all divisors of n.

### Example

input:

```
4
1
2
3
4
```

output:

```
1
3
4
7
```

### Note

The sum of divisors of 1 is 1.

The sum of divisors of 2 is 1+2=3.

The sum of divisors of 3 is 1+3=4.

The sum of divisors of 4 is 1+2+4=7.

### Solution

```java
import java.util.*;

public class GSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }

    public static long solve(long n) {
        long soFar = 0;
        for (long i = 1; i *
