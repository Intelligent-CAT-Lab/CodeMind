

```python
from math import factorial

n = int(input())

print(factorial(1510) + 2)

for i in range(2, 2 + n):
    print(i)
```

## 00994

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
1
1

```
import java.util.*;

public class p00994{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                System.out.println(a[i] + b[i]);
            }
        }
    }
}
```

python code:

```python
n = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

for i in range(n):
    print(a[i] + b[i])
```

## 00995

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
1

```
import java.util.*;

public class p00995{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += a[i] * b[i];
            }

            System.out.println(sum);
        }
    }
}
```

python code:

```python
n = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

sum = 0
for i in range(n):
    sum += a[i] * b[i]

print(sum)
```


```

python code:

```python
n = int(input())

for i in range(n):
    print(i + 1)
```

## 00992

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
1

```
import java.util.*;

public class p00992{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int sum = 0;

            for(int i = 1; i <= n; i++){
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
```

python code:

```python
n = int(input())

sum = 0
for i in range(1, n + 1):
    sum += i

print(sum)
```

## 00993

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8
2
3


```
//[2, 1510] ã®ç´æ°å¨ã¦ããã¤æ´æ°factãæ¢ã
//[fact + 2, fact + 1510] ã¯å¨ã¦ç´æ°ãæã¤ãã¨ãããã
//ã©ããªå¤ãå¥åããããã¨, fact + 2ãåºåãã¦ããã°ãã

import java.util.*;
import java.math.BigInteger;

public class p00993{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger fact = BigInteger.ONE;
        BigInteger mul = BigInteger.ONE;

        for(int i = 1; i <= 1510; i++){
            fact = fact.multiply(mul);
            mul = mul.add(BigInteger.ONE);
        }
        fact = fact.add(new BigInteger("2"));

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(fact);

            for(int i = 2; i < 2 + n; i++){
                System.out.println(i);
            }
        }
    }
}
```

python code:

```python
from math import factorial

n = int(input())

print(factorial(1510) + 2)

for i in range(2, 2 + n):
    print(i)
```

## 00994

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
1
1

```
import java.util.*;

public class
