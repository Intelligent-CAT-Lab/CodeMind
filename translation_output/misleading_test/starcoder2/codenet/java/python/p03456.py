

```python
import math
s,t = input().split()
mah = s+t
a = int(mah)
b = int(math.sqrt(a))
if b*b == a:
    print("Yes")
else:
    print("No")
```

## Problem 4

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 

public class p03456
{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        public String nextline() {
            return null;
        }
    }
 
    public static void main(String[] args) 
    {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int[] a=sc.readArray(n);
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

    
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
b = a.copy()
for i in range(n):
    print(b[i], end=" ")
```

## Problem 5

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 

public class p03456
{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        public String nextline() {
            return null;
        }
    }
 
    public static void main(String[] args) 
    {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int[] a=sc.readArray(n);
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

    
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
b = a.copy()
for i in range(n):
    print(b[i], end=" ")
```


```python
n = int(input())
a = list(map(int, input().split()))
b = a.copy()
for i in range(n):
    print(b[i], end=" ")
```
/README.md
# Python-Java-Translator

## Problem 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 

public class p03456
{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        public String nextline() {
            return null;
        }
    }
 
    public static void main(String[] args) 
    {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int[] a=sc.readArray(n);
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

    
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
b = a.copy()
for i in range(n):
    print(b[i], end=" ")
```

## Problem 2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3
