
```python
S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        pass
    else:
        ans = ans + i
print(ans)
```
/p0001/p0001.md
# p0001

## Problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

## Solution

```python
for i in range(1, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```
/p0002/p0002.md
# p0002

## Problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

## Solution

```python
for i in range(1, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```


```python
S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        pass
    else:
        ans = ans + i
print(ans)
```
/p02712/p02712.md
# p02712

## Problem

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
138

```
import java.util.Scanner;

public class p02712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int list[] = new int[S + 1];
        long ans = 0;
        for (int i = 1; i < S + 1; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
            } else {
                ans = ans + i;
            }
        }
        System.out.println(ans);
    }
}

```

## Solution
