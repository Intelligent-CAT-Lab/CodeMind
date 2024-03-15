
```
a,b,c = map(int,input().split())
min = min(a,b)
max = max(a,b)
print(min(min,c),max(max,c))
```

## 2. 10817번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p10817 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.max(min,Math.min(max,c)));
    }
}
```

python code:
```
a,b,c = map(int,input().split())
min = min(a,b)
max = max(a,b)
print(max(min,min(max,c)))
```

## 3. 2588번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p2588 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*(b/10%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
```

python code:
```
a = int(input())
b = int(input())
print(a*(b%10))
print(a*(b//10%10))
print(a*(b//100))
print(a*b)
```

## 4. 10430번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p10430 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
```

python code:
```
a,b,c = map(int,input().split())
print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)
```

## 5. 2839번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p2839 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/5;
        int b = n%5;
        int c = b/3;
        int d = b%3;
        int e = d/2;
        int f = d%2;
        int g = f/1;
        int h = f%1;
        if(n%5==0) {
            System.out.println(a);
        }
        else if(b%3==0) {
            System.out.println(a+c);
        }
        else if(d%2==0) {
            System.out.println(a+c+e);
        }
        else if(f%1==0) {
            System.out.println(a+c+e+g);
        }
        else {
            System.out.println(-1);
        }
    }
}
```

python code:
```
n = int(input())
a = n//5
b = n%5
c = b//3
d = b%3
e = d//2
f = d%2
g = f//1
h = f%1
if n%5==0:
    print(a)
elif b%3==0:
    print(a+c)
elif d%2==0:
    print(a+c+e)
elif f%1==0:
    print(a+c+e+g)
else:
    print(-1)
```

## 6. 2742번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p2742 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--) {
            System.out.println(i);
        }
    }
}
```

python code:
```
n = int(input())
for i in range(n,0,-1):
    print(i)
```

## 7. 2741번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p2741 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
}
```

python code:
```
n = int(input())
for i in range(1,n+1):
    print(i)
```

## 8. 11021번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p11021 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
    }
}
```

python code:
```
t = int(input())
for i in range(1,t+1):
    a,b = map(int,input().split())
    print("Case #"+str(i)+": "+str(a+b))
```

## 9. 11022번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p11022 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
```

python code:
```
t = int(input())
for i in range(1,t+1):
    a,b = map(int,input().split())
    print("Case #"+str(i)+": "+str(a)+" + "+str(b)+" = "+str(a+b))
```

## 10. 2438번

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p2438 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;
