

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))
```

## 00515

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
import java.util.*;
import java.math.*;
class p00515{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a*b>c){
            System.out.println(0);
            System.exit(0);
        }
        c-=a*b;
        int d=c+a-1;
        BigInteger bi=new BigInteger("1");
        for(int i=0;i<c;i++){
            bi=bi.multiply(new BigInteger(""+(d-i)));
            bi=bi.divide(new BigInteger(""+(i+1)));
        }
        System.out.println(bi.toString());
    }
}
```

python code:

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))
```

## 00516

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
import java.util.*;
import java.math.*;
class p00516{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a*b>c){
            System.out.println(0);
            System.exit(0);
        }
        c-=a*b;
        int d=c+a-1;
        BigInteger bi=new BigInteger("1");
        for(int i=0;i<c;i++){
            bi=bi.multiply(new BigInteger(""+(d-i)));
            bi=bi.divide(new BigInteger(""+(i+1)));
        }
        System.out.println(bi.toString());
    }
}
```

python code:

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))
```

## 00517

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
import java.util.*;
import java.math.*;
class p00517{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a*b>c){
            System.out.println(0);
            System.exit(0);
        }
        c-=a*b;
        int d=c+a-1;
        BigInteger bi=new BigInteger("1");
        for(int i=0;i<c;i++){
            bi=bi.multiply(new BigInteger(""+(d-i)));
            bi=bi.divide(new BigInteger(""+(i+1)));
        }
        System.out.println(bi.toString());
    }
}
```

python code:

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))
```

## 00518

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
import java.util.*;
import java.math.*;
class p00518{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a*b>c){
            System.out.println(0);
            System.exit(0);
        }
        c-=a*b;
        int d=c+a-1;
        BigInteger bi=new BigInteger("1");
        for(int i=0;i<c;i++){
            bi=bi.multiply(new BigInteger(""+(d-i)));
            bi=bi.divide(new BigInteger(""+(i+1)));
        }
        System.out.println(bi.toString());
    }
}
```

python code:

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))
```

## 00519

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
import java.util.*;
import java.math.*;
class p00519{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a*b>c){
            System.out.println(0);
            System.exit(0);
        }
        c-=a*b;
        int d=c+a-1;
        BigInteger bi=new BigInteger("1");
        for(int i=0;i<c;i++){
            bi=bi.multiply(new BigInteger(""+(d-i)));
            bi=bi.divide(new BigInteger(""+(i+1)));
        }
        System.out.println(bi.toString());
    }
}
```

python code:

```python
from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factor
