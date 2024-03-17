

```python
n,m = map(int,input().split())
for i in range(m//n,0,-1):
    if m%i==0:
        print(i)
        break
```


```

python code:

```python
n = int(input())
for i in range(1,n+1):
    print(i)
```
/p03240.md
# p03240

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1
2
3


```/p03242.md
# p03242

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 14

Expected output:
2


```
import java.util.*;public class p03242{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

python code:

```python
n,m = map(int,input().split())
for i in range(m//n,0,-1):
    if m%i==0:
        print(i)
        break
```


```python
n = int(input())
for i in range(1,n+1):
    print(i)
```
/p03240.py
# p03240

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1
2
3


```
import java.util.*;public class p03240{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){System.out.print(i);}}}

```/p03241.py
# p03241

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 14

Expected output:
2


```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

python code:

```python
n,m = map(int,input().split())
for i in range(m//n,0,-1):
    if m%i==0:
        print(i)
        break
```

