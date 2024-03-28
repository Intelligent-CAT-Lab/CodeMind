

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n+1];
        for(int x=1;x<=100;x++){
            for(int y=1;y<=100;y++){
                for(int z=1;z<=100;z++){
                    int a = x*x+y*y+z*z+x*y+y*z+z*x;
                    if(a<=n){
                        cnt[a]++;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=1;
                }
            }
        }
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=1;
                }
            }
        }
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
```


```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=1;
                }
            }
        }
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=1;
                }
            }
        }
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Programming-Assignment

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0


```
import collections
n=int(input())
cnt=[]
for x in range(1,101):
  for y in range(1,101):
    for z in range(1,101):
      a=x**2+y**2+z**2+x*y+y*z+z*x
      if a<=n:
        cnt.append(a)
c=collections.Counter(cnt)
for i in range(1,n+1):
  print(c[i])
```

java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n+1];
        for(int x=1;x<=100;x++){
            for(int y=1;y<=100;y++){
                for(int z=1;z<=100;z++){
                    int a = x*x+y*y+z*z+x*y+y*z+z*x;
                    if(a<=n){
                        cnt[a]++;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.
