

```python
n = int(input())

result = 0
array = [[0 for i in range(10)] for j in range(10)]
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

print(result)
```

## 02793

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02793 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 0;
        int[] array = new int[10];
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            array[head]++;
        }
        
        int keta = String.valueOf(n).length();
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            if(head == 0) continue;
            result += array[head];
        }
        
        // åºå
        System.out.println(result);
    }
}



```

python code:

```python
n = int(input())

result = 0
array = [0 for i in range(10)]
for i in range(1, n+1):
    head = int(str(i)[0])
    array[head] += 1

keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    if head == 0:
        continue
    result += array[head]

print(result)
```

## 02794

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02794 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 0;
        int[] array = new int[10];
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            array[head]++;
        }
        
        int keta = String.valueOf(n).length();
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            if(head == 0) continue;
            result += array[head];
        }
        
        // åºå
        System.out.println(result);
    }
}



```

python code:

```python
n = int(input())

result = 0
array = [0 for i in range(10)]
for i in range(1, n+1):
    head = int(str(i)[0])
    array[head] += 1

keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    if head == 0:
        continue
    result += array[head]

print(result)
```

## 02795

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02795 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 0;
        int[] array = new int[10];
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            array[head]++;
        }
        
        int keta = String.valueOf(n).length();
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            if(head == 0) continue;
            result += array[head];
        }
        
        // åºå
        System.out.println(result);
    }
}



```

python code:

```python
n = int(input())

result = 0
array = [0 for i in range(10)]
for i in range(1, n+1):
    head = int(str(i)[0])
    array[head] += 1

keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    if head == 0:
        continue
    result += array[head]

print(result)
```

## 02796

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02796 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 0;
        int[] array = new int[10];
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).substring(0,1));
            array[head]++;
        }
        
        int keta = String.valueOf(n).length();
        for(int i = 1; i <= n; i++){
            int head = Integer.valueOf(String.valueOf(i).
