
```python
X, Y = map(int, input().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```

## 03472

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p03472 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long sum=0;
        long i=1;
        while (sum<N) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }

}
```

python code:
```python
N = int(input())

sum = 0
i = 1
while sum < N:
    sum += i
    i += 1

print(sum)
```

## 03473

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p03473 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long sum=0;
        long i=1;
        while (sum<N) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }

}
```

python code:
```python
N = int(input())

sum = 0
i = 1
while sum < N:
    sum += i
    i += 1

print(sum)
```
/03471.py
X, Y = map(int, input().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")


print(sum)
/03473.py
N = int(input())

sum = 0
i = 1
while sum < N:
    sum += i
    i += 1

sum = 0
i = 1
while sum < N:
    sum += i
    i += 1

print(sum)
/03472.py
N = int(input())
