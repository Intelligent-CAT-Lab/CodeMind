

```python
import sys

for line in sys.stdin:
    a, b = map(float, line.split())
    print((a * b) / 3.305785)
```


```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a + b)
```
/p00001.md
# p00001

## Problem

Write a program that reads two integers and prints their sum.

## Input

The input is a sequence of lines, each line contains two integers.

## Output

For each line of input, output one line containing an integer which is the sum of the integers of the input line.

## Sample Input

```
1 5
10 20
```

## Sample Output

```
6
30
```

## Solution

```java
import java.util.*;

public class p00001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) System.out.println(sc.nextInt() + sc.nextInt());
    }    
}
```

python code:

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a + b)
```

## Solution 2

```java
import java.util.*;

public class p00001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }    
}
```

python code:

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a + b)
```

## Solution 3

```java
import java.util.*;

public class p00001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }    
}
```

python code:

```
10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
