

```python
a,b,c,d = map(int,input().split())
sum = 0
if d<=a:
    print(d)
else:
    sum = a
    d -= a
    if d<=b:
        print(sum)
    else:
        d-=b
        sum -= d
        print(sum)
```

## 2. 10039

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100
100

Expected output:
100


```
import java.util.*;

public class p10039{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    if (a<40){
      a = 40;
    }
    if (b<40){
      b = 40;
    }
    System.out.println((a+b)/2);
  }
}

```

python code:

```python
a,b = map(int,input().split())
if a<40:
    a = 40
if b<40:
    b = 40
print((a+b)//2)
```

## 3. 10817

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
2


```
import java.util.*;

public class p10817{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    if (a>b){
      if (b>c){
        System.out.println(b);
      }else if (a>c){
        System.out.println(c);
      }else{
        System.out.println(a);
      }
    }else{
      if (a>c){
        System.out.println(a);
      }else if (b>c){
        System.out.println(c);
      }else{
        System.out.println(b);
      }
    }
  }
}

```

python code:

```python
a,b,c = map(int,input().split())
if a>b:
    if b>c:
        print(b)
    elif a>c:
        print(c)
    else:
        print(a)
else:
    if a>c:
        print(a)
    elif b>c:
        print(c)
    else:
        print(b)
```

## 4. 10871

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5
1 10 4 9 2 3 8 5 7 6

Expected output:
1 4 2 3 
7 6


```
import java.util.*;

public class p10871{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = scan.nextInt();
    for (int i=0;i<n;i++){
      int a = scan.nextInt();
      if (a<x){
        System.out.print(a+" ");
      }
    }
  }
}

```

python code:

```python
n,x = map(int,input().split())
a = list(map(int,input().split()))
for i in range(n):
    if a[i]<x:
        print(a[i],end=' ')
```

## 5. 1110

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
26

Expected output:
13


```
import java.util.*;

public class p1110{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = n/10;
    int b = n%10;
    int c = a+b;
    int d = c%10;
    int e = c/10;
    int f = b*10+d;
    int count = 1;
    while (n!=f){
      a = f/10;
      b = f%10;
      c = a+b;
      d = c%10;
      e = c/10;
      f = b*10+d;
      count++;
    }
    System.out.println(count);
  }
}

```

python code:

```python
n = int(input())
a = n//10
b = n%10
c = a+b
d = c%10
e = c//10
f = b*10+d
count = 1
while n!=f:
    a = f//10
    b = f%10
    c = a+b
    d = c%10
    e = c//10
    f = b*10+d
    count+=1
print(count)
```

## 6. 11720

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1
1

Expected output:
1


```
import java.util.*;

public class p11720{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = scan.next();
    int sum = 0;
    for (int i=0;i<n;i++){
      sum += s.charAt(i)-'0';
    }
    System.out.println(sum);
  }
}

```

python code:

```python
n = int(input())
s = input()
sum = 0
for i in range(n):
    sum += int(s[i])
print(sum)
```

## 7. 11721

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABCDE

Expected output:
AB
CD
E


```
import java.util.*;

public class p11721{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    for (int i=0;i<s.length();i++){
      System.out.println(s.charAt(i));
    }
  }
}

```

python code:

```python
s = input()
for i in range(len(s)):
    print(s[i])
```

## 8. 1330

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
<


```
import java.util.*;

public class p1330{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    if (a>b){
      System.out.println(">");
    }else if (a<b){
      System.out.println("<");
    }else{
      System.out.println("==");
    }
  }
}

```

python code:

```
