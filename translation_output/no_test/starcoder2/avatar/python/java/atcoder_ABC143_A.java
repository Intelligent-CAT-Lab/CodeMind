
```java

```


```

java code:
```java

```
/problems/1000/1000.md
# 1000 - A+B Problem

## Description

Your task is to calculate the sum of some integers.

## Input

Input contains multiple test cases. Each test case contains a integer N, and then N integers follow in the same line. A test case starting with 0 terminates the input and this test case is not to be processed.

## Output

For each group of input integers you should output their sum in one line, and with one line of output for each line in input.

## Sample Input
```
4 1 2 3 4
5 1 2 3 4 5
0
```

## Sample Output
```
10
15
```

## Hint

## Solution

## Code

python code:
```python
while True:
    n = int(input())
    if n == 0:
        break
    else:
        a = list(map(int, input().split()))
        print(sum(a))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += sc.nextInt();
                }
                System.out.println(sum);
            }
        }
    }
}
```/problems/1001/1001.md
# 1001 - A+B Problem II

## Description

Your task is to Calculate a + b.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line consists of a pair of integers a and b, separated by a space, one pair of integers per line.

## Output

For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

## Sample Input
```
2
1 5
10 20
```

## Sample Output
```
6
30
```

## Hint

## Solution

## Code

python code:
```python
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    print(a + b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## 题目翻译

## 题目大意

## 解题思路

## 参考代码

python code:
```python

```

java code:
```java

```
/problems/1002/1002.md
# 1002 - A+B Problem III

## Description

Your task is to Calculate a + b.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line consists of a pair of integers a and b, separated by a space, one pair of integers per line.

## Output

For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

## Sample Input
```
2
1 5
10 20
```

## Sample Output
```
6
30
```

## Hint

## Solution

## Code

python code:
```python
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    print(a + b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## 题目翻译

## 题目大意

## 解题思路

## 参考代码

python code:
```python

```

java code:
```java

```


## 题目翻译

## 题目大意

## 解题思路

## 参考代码

python code:
```python

```

java code:
```java

```
/problems/1003/1003.md
# 1003 - A+B Problem IV

## Description

Your task is to Calculate a + b.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line consists of a pair of integers a and b, separated by a space, one pair of integers per line.

## Output

For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

## Sample Input
```
2
1 5
10 20
```

## Sample Output
```
6
30
```

## Hint

## Solution

## Code

python code:
```python
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    print(a + b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```
