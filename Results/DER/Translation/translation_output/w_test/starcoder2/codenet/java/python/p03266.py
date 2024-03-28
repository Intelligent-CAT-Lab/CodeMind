

```python
import sys

N, K = map(int, sys.stdin.readline().split())

if K % 2 == 0:
    c1 = N // K
    c2 = N // (K // 2) - c1
    print(c1 * c1 * c1 + c2 * c2 * c2)
else:
    c = N // K
    print(c * c * c)
```


```python
import sys

N = int(sys.stdin.readline())

for i in range(N):
    print(i + 1)
```
/p00001.md
# p00001

## Problem

Write a program that prints the numbers from 1 to N.

## Input

The input is a single integer N.

## Output

Print the numbers from 1 to N, each on a separate line.

## Sample

### Input

```
5
```

### Output

```
1
2
3
4
5
```

## Solution

```java
import java.util.*;

public class p00001 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    for (int i = 1; i <= N; i++) {
      System.out.println(i);
    }

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

for i in range(1, N + 1):
    print(i)
```

python code:/p00002.md
# p00002

## Problem

Write a program that prints the numbers from 1 to N, but for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Input

The input is a single integer N.

## Output

Print the numbers from 1 to N, each on a separate line.

## Sample

### Input

```
15
```

### Output

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Solution

```java
import java.util.*;

public class p00002 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    for (int i = 1; i <= N; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

for i in range(1, N + 1):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```

python code:

```python
import sys

N = int(sys.stdin.readline())

for i in range(1, N + 1):
    if i % 15 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```


```python
import sys

N = int(sys.stdin.readline())

for i in range(N):
    print(i + 1)
```
/p00003.md
# p00003

## Problem

Write a program that prints the numbers from 1 to N, but for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Input

The input is a single integer N.

## Output

Print the numbers from 1 to N, each on a separate line.

## Sample

### Input

```
15
```

### Output

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Solution

```java
import java.util.*;

public class p00003 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    for (int i = 1; i <= N; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

for i in range(1, N + 1):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```/p00004.md
# p00004

## Problem

Write a program that prints the numbers from 1 to N, but for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Input

The input is a single integer N.

## Output

Print the numbers from 1 to N, each on a separate line.

## Sample

### Input

```
15
```

### Output

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Solution

```java
import java.util.*;

public class p00004 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    for (int i = 1; i <= N; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }Buzz")
    else:
        print(i)
```

python code:

```python
import sys

N = int(sys.stdin.readline())

for i in range(1, N + 1):
    if i % 15 == 0:
        print("FizzBu
