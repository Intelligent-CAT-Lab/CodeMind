
```
a = int(input())
b = int(input())
r1 = a
x1 = 1
y1 = 0
r2 = b
x2 = 0
y2 = 1
r3 = 0
q = 0
x3 = 0
y3 = 0
while r2 != 0:
    q = r1 // r2
    r3 = r1 % r2
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1 = r2
    r2 = r3
    x1 = x2
    x2 = x3
    y1 = y2
    y2 = y3
print(x1, y1)
```

## 2.4.72

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p02472 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a,x1=1,y1=0,r2=b,x2=0,y2=1,r3,q,x3,y3;
        while(r2!=0){
            q=r1/r2;
            r3=r1%r2;
            x3=x1-q*x2;
            y3=y1-q*y2;
            r1=r2;
            r2=r3;
            x1=x2;
            x2=x3;
            y1=y2;
            y2=y3;
        }
        System.out.println(x1+" "+y1);
    }
    
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(a,a%b);
    }
}


```

python code:
```
a = int(input())
b = int(input())
r1 = a
x1 = 1
y1 = 0
r2 = b
x2 = 0
y2 = 1
r3 = 0
q = 0
x3 = 0
y3 = 0
while r2 != 0:
    q = r1 // r2
    r3 = r1 % r2
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1 = r2
    r2 = r3
    x1 = x2
    x2 = x3
    y1 = y2
    y2 = y3
print(x1, y1)
```

## 2.4.73

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p02473 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a,x1=1,y1=0,r2=b,x2=0,y2=1,r3,q,x3,y3;
        while(r2!=0){
            q=r1/r2;
            r3=r1%r2;
            x3=x1-q*x2;
            y3=y1-q*y2;
            r1=r2;
            r2=r3;
            x1=x2;
            x2=x3;
            y1=y2;
            y2=y3;
        }
        System.out.println(x1+" "+y1);
    }
    
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(a,a%b);
    }
}


```

python code:
```
a = int(input())
b = int(input())
r1 = a
x1 = 1
y1 = 0
r2 = b
x2 = 0
y2 = 1
r3 = 0
q = 0
x3 = 0
y3 = 0
while r2 != 0:
    q = r1 // r2
    r3 = r1 % r2
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1 = r2
    r2 = r3
    x1 = x2
    x2 = x3
    y1 = y2
    y2 = y3
print(x1, y1)
```

## 2.4.74

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p02474 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a,x1=1,y1=0,r2=b,x2=0,y2=1,r3,q,x3,y3;
        while(r2!=0){
            q=r1/r2;
            r3=r1%r2;
            x3=x1-q*x2;
            y3=y1-q*y2;
            r1=r2;
            r2=r3;
            x1=x2;
            x2=x3;
            y1=y2;
            y2=y3;
        }
        System.out.println(x1+" "+y1);
    }
    
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(a,a%b);
    }
}


```

python code:
```
a = int(input())
b = int(input())
r1 = a
x1 = 1
y1 = 0
r2 = b
x2 = 0
y2 = 1
r3 = 0
q = 0
x3 = 0
y3 = 0
while r2 != 0:
    q = r1 // r2
    r3 = r1 % r2
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1 = r2
    r2 = r3
    x1 = x2
    x2 = x3
    y1 = y2
    y2 = y3
print(x1, y1)
```

## 2.4.75

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p02475 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r1=a,x1=1,y1=0,r2=b,x2=0,y2=1,r3,q,x3,y3;
        while(r2!=0){
            q=r1/r2;
            r3=r1%r2;
            x3=x1-q*x2;
            y3=y1-q
