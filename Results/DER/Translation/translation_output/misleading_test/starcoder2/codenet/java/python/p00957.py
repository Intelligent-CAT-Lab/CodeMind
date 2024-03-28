
```
l,k=map(int,input().split())
dp=[[0 for i in range(l+1)] for j in range(2)]
dp[0][0]=1
for i in range(1,l+1):
    dp[0][i]+=dp[1][i-1]
    dp[1][i]+=dp[0][i-1]
    if i>=k:
        dp[1][i]+=dp[0][i-k]
ans=0
for i in range(1,l+1):
    ans+=dp[1][i]
print(ans)
```


```

python code:
```
n=int(input())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
a.sort()
b.sort()
ans=0
for i in range(n):
    ans+=a[i]*b[i]
print(ans)
```
/p00956.md
# p00956

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3
3 2 1

Expected output:
10

```
import java.io.*;
import java.util.*;


class p00956 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=0;i<n;++i)
            a[i]=sc.nextInt();
        for(int i=0;i<n;++i)
            b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        long ans=0;
        for(int i=0;i<n;++i)
            ans+=a[i]*b[i];
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
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
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```  }
        }
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
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
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
a.sort()
b.sort()
ans=0
for i in range(n):
    ans+=a[i]*b[i]
print(ans)
```
/p00955.md
# p00955

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3
3 2 1

Expected output:
10

```
import java.io.*;
import java.util.*;


class p00955 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=0;i<n;++i)
            a[i]=sc.nextInt();
        for(int i=0;i<n;++i)
            b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        long ans=0;
        for(int i=0;i<n;++i)
            ans+=a[i]*b[i];
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
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
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br
