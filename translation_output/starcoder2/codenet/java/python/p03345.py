
```
a,b,c,k = map(int,input().split())
ans = a-b
if abs(ans)>pow(10,18):
    print("Unfair")
else:
    if k%2==0:
        print(ans)
    else:
        print(ans*-1)
```

## 3346

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03346 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]>a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i]>a[j]:
            ans+=1
print(ans)
```

## 3347

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03347 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]<a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i]<a[j]:
            ans+=1
print(ans)
```

## 3348

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03348 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i]==a[j]:
            ans+=1
print(ans)
```

## 3349

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03349 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]!=a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i]!=a[j]:
            ans+=1
print(ans)
```

## 3350

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03350 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]%a[j]==0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i]%a[j]==0:
            ans+=1
print(ans)
```

## 3351

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03351 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[j]%a[i]==0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[j]%a[i]==0:
            ans+=1
print(ans)
```

## 3352

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03352 {

    public static void main(String[] args) {
        Scanner
