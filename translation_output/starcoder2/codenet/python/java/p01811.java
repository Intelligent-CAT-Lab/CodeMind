
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moto = sc.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[100000];
        int l = 0;
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log[l] = "A";
                l++;
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log[l] = "C";
                l++;
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log[l] = "B";
                l++;
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        for (int i = l - 1; i >= 0; i--) {
            s = s.replace(log[i], "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## 2. 
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
n=int(input())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
c=list(map(int,input().split()))
d=list(map(int,input().split()))
e=list(map(int,input().split()))
f=list(map(int,input().split()))
g=list(map(int,input().split()))
h=list(map(int,input().split()))
i=list(map(int,input().split()))
j=list(map(int,input().split()))
k=list(map(int,input().split()))
l=list(map(int,input().split()))
m=list(map(int,input().split()))
o=list(map(int,input().split()))
p=list(map(int,input().split()))
q=list(map(int,input().split()))
r=list(map(int,input().split()))
s=list(map(int,input().split()))
t=list(map(int,input().split()))
u=list(map(int,input().split()))
v=list(map(int,input().split()))
w=list(map(int,input().split()))
x=list(map(int,input().split()))
y=list(map(int,input().split()))
z=list(map(int,input().split()))

```

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        int[] e = new int[n];
        int[] f = new int[n];
        int[] g = new int[n];
        int[] h = new int[n];
        int[] i = new int[n];
        int[] j = new int[n];
        int[] k = new int[n];
        int[] l = new int[n];
        int[] m = new int[n];
        int[] o = new int[n];
        int[] p = new int[n];
        int[] q = new int[n];
        int[] r = new int[n];
        int[] s = new int[n];
        int[] t = new int[n];
        int[] u = new int[n];
        int[] v = new int[n];
        int[] w = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            i[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            j[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            o[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            u[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            z[i] = sc.nextInt();
        }
    }
}
```

## 3. 
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
n=int(input())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
c=list(map(int,input().split()))
d=list(map
