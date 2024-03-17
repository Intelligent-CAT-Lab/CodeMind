

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
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
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n / a + (n % a > 0 ? 1 : 0)) * (m / a + (m % a > 0 ? 1 : 0)));
    }
}
```
/problems/0000000000000000000000000000000000000000000000000000000000000000/0000000000000000000000000000000000000000000000000000000000000001/problem.md
# A. Theatre Square

## Description

Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

## Input

The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

## Output

Write the needed number of flagstones.

## Sample Input

```
6 6 4
```

## Sample Output

```
4
```

## Sample Input

```
1 1 1
```

## Sample Output

```
1
```

## Sample Input

```
2 3 1
```

## Sample Output

```
6
```

## Sample Input

```
1000000000 1000000000 1
```

## Sample Output

```
1000000000000000000
```

## Note

In the first sample, we can place four 4 × 4 flagstones like that:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the second sample, we need to place one 1 × 1 flagstone:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the third sample, we need to place six 1 × 1 flagstones:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the fourth sample, we need to place 10^18 flagstones.

## Hint

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )
/problems/0000000000000000000000000000000000000000000000000000000000000000/0000000000000000000000000000000000000000000000000000000000000001/solution.md
# Solution

## Problem

Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

## Input

The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

## Output

Write the needed number of flagstones.

## Sample Input

```
6 6 4
```

## Sample Output

```
4
```

## Sample Input

```
1 1 1
```

## Sample Output

```
1
```

## Sample Input

```
2 3 1
```

## Sample Output

```
6
```

## Sample Input

```
1000000000 1000000000 1
```

## Sample Output

```
1000000000000000000
```

## Note

In the first sample, we can place four 4 × 4 flagstones like that:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the second sample, we need to place one 1 × 1 flagstone:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the third sample, we need to place six 1 × 1 flagstones:

![img](https://espresso.codeforces.com/711a16d0196d5938d4590d20ce7f167a1621540b.png)

In the fourth sample, we need to place 10^18 flagstones.

## Hint

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )

```

java code:


