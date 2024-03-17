

```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.printf("%.10f", 4/3*Math.PI*Math.pow(B, 3));
    }
}
```
/01-Introduction/01-Say-Hello-World-With-Python/README.md
# Say "Hello, World!" With Python

## Problem

This is a simple challenge to help you practice printing to stdout. You may also want toe the [Tutorial](https://www.hackerrank.com/challenges/py-hello-world/tutorial) tab for reading material on string formatting.

## Input Format

You do not need to read any input in this challenge.

## Output Format

Print Hello, World! to stdout.

## Sample Output

Hello, World!

## Solution

```python
print("Hello, World!")
```
 consult the [Pythong 3 Tutorial](https://www.hackerrank.com/challenges/py-hello-world/tutorial) at the end of this challenge.

All input comes from stdin (standard input) while output is written to stdout (standard output).

## Task

To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.

You've got this!

Note: The instructions are Java-based, but we support submissions in many popular languages. You can translat/01-Introduction/02-Python-If-Else/README.md
# Python If-Else

## Problem

Given an integer, n, perform the following conditional actions:

- If n is odd, print Weird
- If n is even and in the inclusive range of 2 to 5, print Not Weird
- If n is even and in the inclusive range of 6 to 20, print Weird
- If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n is weird.

## Input Format

A single line containing a positive integer, n.

## Constraints

- 1 <= n <= 100

## Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

## Sample Input 0

3

## Sample Output 0

Weird

## Sample Input 1

24

## Sample Output 1

Not Weird

## Explanation

Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

## Solution

```python
#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if n % 2 == 1:
        print("Weird")
    elif n % 2 == 0 and n in range(2, 6):
        print("Not Weird")
    elif n % 2 == 0 and n in range(6, 21):
        print("Weird")
    elif n % 2 == 0 and n > 20:
        print("Not Weird")
```
/01-Introduction/03-Arithmetic-Operators/README.md
# Arithmetic Operators

## Problem

Read two integers from STDIN and print three lines where:

1. The first line contains the sum of the two numbers.
2. The second line contains the difference of the two numbers (first - second).
3. The third line contains the product of the two numbers.

## Input Format

The first line contains the first integer, a. The second line contains the second integer, b.

## Constraints

- 1 <= a <= 10^10
- 1 <= b <= 10^10

## Output Format

Print the three lines as explained above.

## Sample Input

3
2

## Sample Output

5
1
6

## Explanation

3 + 2 => 5
3 - 2 => 1
3 * 2 => 6

## Solution

```python
if __name__ == '__main__':
    a = int(input())
    b = int(input())
    print(a + b)
    print(a - b)
    print(a * b)
```


## Sample Input 0

5

## Sample Output 0

120

## Explanation 0

5! = 1 x 2 x 3 x 4 x 5 = 120

## Solution

```python
if __name__ == '__main__':
    n = int(input())
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    print(fact)
```
/01-Introduction/08-Write-a-function/README.md
# Write a function

## Problem

Write a recursive function to compute factorial of a given number.

## Input Format

Only one number N (integer) is given as input.

## Output Format

Print the factorial of N.

## Constraints

- 1 <= N <= 1000

## Sample Input 0

3

## Sample Output 0

6

## Explanation 0

3! = 3 x 2 x 1 = 6

## Sample Input 1

5

## Sample Output 1

120

## Explanation 1

5! = 5 x 4 x 3 x 2 x 1 = 120

## Sample Input 2

10

## Sample Output 2

3628800

## Explanation 2

10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 3628800

## Sample Input 0

1/01-Introduction/04-Python-Division/README.md
# Python: Division

## Problem

Read two integers and print two lines. The first line should contain integer division, a // b. The second line should contain float division, a / b.

You don't need to perform any rounding or formatting operations.

## Input Format

The first line contains the first integer, a. The second line contains the second integer, b.

## Output Format

Print the two lines as described above.

## Sample Input 0

4
3

## Sample Output 0

1
1.33333333333

## Explanation 0

4 / 3 = 1 (integer division) and 4 / 3 = 1.33333333333 (float division).

## Sample Input 1

3
2

## Sample Output 1

1
1.5

## Explanation 1

3 / 2 = 1 (integer division) and 3 / 2 = 1.5 (float division).

## Solution

```python
if __name__ == '__main__':
    a = int(input())
    b = int(input())
    print(a // b)
    print(a / b)
```
/01-Introduction/05-Loops/README.md
# Loops

## Problem

Read an integer N. For all non-negative integers i < N, print i^2. See the sample for details.

## Input Format

The first and only line contains the integer, N.

## Constraints

- 1 <= N <= 20


## Explanation

We have N = 5. Thus, we print 0, 1, 4, 9, 16 on separate lines.

## Solution

```python
if __name__ == '__main__':
    n = int(input())
    for i
