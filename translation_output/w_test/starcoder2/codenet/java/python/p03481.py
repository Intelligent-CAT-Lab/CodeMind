

```python
X, Y = map(int, input().split())
i = 0
while X <= Y:
    i += 1
    X *= 2
print(i)
```

## 03482

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 100

Expected output:
100


```
import java.util.*;
public class p03482 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(X);
    }
}
```

python code:

```python
X, Y = map(int, input().split())
i = 0
while X <= Y:
    i += 1
    X *= 2
print(X)
```

## 03483

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 100

Expected output:
10


```
import java.util.*;
public class p03483 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i-1);
    }
}
```

python code:

```python
X, Y = map(int, input().split())
i = 0
while X <= Y:
    i += 1
    X *= 2
print(i-1)
```
/03481.py
X, Y = map(int, input().split())
i = 0
while X <= Y:
    i += 1
    X *= 2
print(i)
/03482.py
X, Y = map(int, input().split())
i = 0
while X <= Y:
    i += 1
    X *= 2
print(X)
/03483.py
X, Y = map(int, input().split())
i = 0
while X <= Y:
 *= 2
print(i-1)
    i += 1
    X
