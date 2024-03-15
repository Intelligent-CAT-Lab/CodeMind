
```
n,a,b=map(int,input().split())
if a>b or (n==1 and a!=b):
    print(0)
elif a==b:
    print(1)
else:
    print((n-2)*(b-a)+1)
```

## 03706

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

    public class p03706 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++) {
                b[i] = sc.nextInt();
            }
            
            int i=0;
            int j=0;
            int cnt=0;
            while(i<n&&j<m) {
                if(a[i]==b[j]) {
                    cnt++;
                    i++;
                    j++;
                }else if(a[i]<b[j]) {
                    i++;
                }else {
                    j++;
                }
            }
            
            System.out.println(cnt);
            
        }
                
    }

```

python code:
```
n,m=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
i=0
j=0
cnt=0
while i<n and j<m:
    if a[i]==b[j]:
        cnt+=1
        i+=1
        j+=1
    elif a[i]<b[j]:
        i+=1
    else:
        j+=1
print(cnt)
```

## 03707

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

    public class p03707 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++) {
                b[i] = sc.nextInt();
            }
            
            int i=0;
            int j=0;
            int cnt=0;
            while(i<n&&j<m) {
                if(a[i]==b[j]) {
                    cnt++;
                    i++;
                    j++;
                }else if(a[i]<b[j]) {
                    i++;
                }else {
                    j++;
                }
            }
            
            System.out.println(cnt);
            
        }
                
    }

```

python code:
```
n,m=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
i=0
j=0
cnt=0
while i<n and j<m:
    if a[i]==b[j]:
        cnt+=1
        i+=1
        j+=1
    elif a[i]<b[j]:
        i+=1
    else:
        j+=1
print(cnt)
```

## 03708

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

    public class p03708 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++) {
                b[i] = sc.nextInt();
            }
            
            int i=0;
            int j=0;
            int cnt=0;
            while(i<n&&j<m) {
                if(a[i]==b[j]) {
                    cnt++;
                    i++;
                    j++;
                }else if(a[i]<b[j]) {
                    i++;
                }else {
                    j++;
                }
            }
            
            System.out.println(cnt);
            
        }
                
    }

```

python code:
```
n,m=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
i=0
j=0
cnt=0
while i<n and j<m:
    if a[i]==b[j]:
        cnt+=1
        i+=1
        j+=1
    elif a[i]<b[j]:
        i+=1
    else:
        j+=1
print(cnt)
```

## 03709

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

    public class p03709 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++) {
                b[i] = sc.nextInt();
            }
            
            int i=0;
            int j=0;
            int cnt=0;
            while(i<n&&j<m) {
                if(a[i]==b[j]) {
                    cnt++;
                    i++;
                    j++;
                }else if(a[i]<b[j]) {
                    i++;
                }else {
                    j++;
                }
            }
            
            System.out.println(cnt);
            
        }
                
    }

```

python code:
```
n,m=map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
i=0
j=0
cnt=0
while i<n and j<m:
    if a[i]==b[j]:
        cnt+=1
        i+=1
        j+=1
    elif a[i]<b[j]:
        i+=1
    else:
        j+=1
print(cnt)
```

## 03710

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

    public class p03710 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++) {
                b[i] = sc.nextInt();
            }
            
            int i
