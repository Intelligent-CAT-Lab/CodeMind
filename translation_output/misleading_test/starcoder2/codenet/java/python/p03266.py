

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

    for (int i = 0; i < N; i++) {
      System.out.println(i + 1);
    }

  }

}
```

python code:

```

### Output

```
1
```

## Solution

```java
import java.util.*;

public class p00002 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int count = 0;
    for (int i = 0; i < N; i++) {
      if (sc.nextInt() == 1) {
        count++;
      }
    }

    System.out.println(count);

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

count = 0
for i in range(N):
    if int(sys.stdin.readline()) == 1:
        count += 1

print(count)
```
/p00002.md
# p00002

## Problem

Write a program that counts the number of 1s in the input.

## Input

The first line of the input is a single integer N.

The next N lines contain either 0 or 1.

## Output

Print the number of 1s in the input.

## Sample

### Input

```
5
0
1
0
1
0/p00003.md
# p00003

## Problem

Write a program that prints the sum of the numbers in the input.

## Input

The first line of the input is a single integer N.

The next N lines contain integers.

## Output

Print the sum of the numbers in the input.

## Sample

### Input

```
5
1
2
3
4
5
```

### Output

```
15
```

## Solution

```java
import java.util.*;

public class p00003 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += sc.nextInt();
    }

    System.out.println(sum);

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

sum = 0
for i in range(N):
    sum += int(sys.stdin.readline())

print(sum)
```


## Sample

### Input

```
5
1
2
3
4
5
```

### Output

```
15
```

## Solution

```java
import java.util.*;

public class p00004 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += sc.nextInt();
    }

    System.out.println(sum);

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

sum = 0
for i in range(N):
    sum += int(sys.stdin.readline())

print(sum)
```
/p00004.md
# p00004

## Problem

Write a program that prints the sum of the numbers in the input.

## Input

The input is a single integer N.

## Output

Print the sum of the numbers in the input./p00005.md
# p00005

## Problem

Write a program that prints the sum of the numbers in the input.

## Input

The input is a single integer N.

## Output

Print the sum of the numbers in the input.

## Sample

### Input

```
5
```

### Output

```
15
```

## Solution

```java
import java.util.*;

public class p00005 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += sc.nextInt();
    }

    System.out.println(sum);

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

sum = 0
for i in range(N):
    sum += int(sys.stdin.readline())

print(sum)
```

## Problem

Write a program that prints the sum of the numbers in the input.

## Input

The input is a single integer N.

## Output

Print the sum of the numbers in the input.

## Sample

### Input

```
5
```

### Output

```
15
```

## Solution

```java
import java.util.*;

public class p00005 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += sc.nextInt();
    }

    System.out.println(sum);

  }

}
```

python code:

```python
import sys

N = int(sys.stdin.readline())

sum = 0
for i in range(N):
    sum += int(sys.stdin.readline())

print(sum)
```

## Problem

Write a program that prints the sum of the numbers in the input.

## Input

The input is a single integer N.

## Output

Print the sum of the numbers in the input.

## Sample

### Input

```
5
```

### Output

```
15
```

## Solution

```java
import java.util.*;

public class p00005 {

  public static void main (String[] args
