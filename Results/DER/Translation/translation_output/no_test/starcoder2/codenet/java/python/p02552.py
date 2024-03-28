
```
n = int(input())
if n == 0:
    print(1)
else:
    print(0)
```

## 2.5.6
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int maxIndex = 0;
        for(int i=0;i<9;i++) {
            int n = sc.nextInt();
            if(n>max) {
                max = n;
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
```

python code:
```
max = 0
maxIndex = 0
for i in range(9):
    n = int(input())
    if n > max:
        max = n
        maxIndex = i+1
print(max)
print(maxIndex)
```

## 2.5.7
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a*b*c;
        int[] count = new int[10];
        while(result>0) {
            int digit = result%10;
            count[digit]++;
            result = result/10;
        }
        for(int i=0;i<10;i++) {
            System.out.println(count[i]);
        }
    }
}
```

python code:
```
a = int(input())
b = int(input())
c = int(input())
result = a*b*c
count = [0]*10
while result > 0:
    digit = result%10
    count[digit] += 1
    result = result//10
for i in range(10):
    print(count[i])
```

## 2.5.8
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        boolean isPrime = false;
        for(int i=m;i<=n;i++) {
            isPrime = true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                sum += i;
                if(min==0)
                    min = i;
            }
        }
        if(sum==0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
```

python code:
```
m = int(input())
n = int(input())
sum = 0
min = 0
isPrime = False
for i in range(m, n+1):
    isPrime = True
    for j in range(2, i):
        if i%j == 0:
            isPrime = False
            break
    if isPrime:
        sum += i
        if min == 0:
            min = i
if sum == 0:
    print(-1)
else:
    print(sum)
    print(min)
```

## 2.5.9
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b%10;
        int d = (b/10)%10;
        int e = b/100;
        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*b);
    }
}
```

python code:
```
a = int(input())
b = int(input())
c = b%10
d = (b//10)%10
e = b//100
print(a*c)
print(a*d)
print(a*e)
print(a*b)
```

## 2.5.10
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int r = sc.nextInt();
            String s = sc.next();
            for(int j=0;j<s.length();j++) {
                for(int k=0;k<r;k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
```

python code:
```
t = int(input())
for i in range(t):
    r = int(input())
    s = input()
    for j in range(len(s)):
        for k in range(r):
            print(s[j], end='')
    print()
```

## 2.5.11
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=9;i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
```

python code:
```
n = int(input())
for i in range(1, 10):
    print(n, "*", i, "=", n*i)
```

## 2.5.12
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02741 {
    public static void main(String[] args) {
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
for i in range(1, n+1):
    print(i)
```

## 2.5.13
Translate the following java code to python and enclose your solution inside ```python```:
```
import
