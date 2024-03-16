
```
import sys

def help(K,A,B):
    if A<=B:
        return 1 if A>=K else -1
    if A>=K:
        return 1
    dif = A-B
    t = (K-A)//dif+((K-A)%dif==0 and 0 or 1)
    return 2*t+1

K,A,B = map(int,sys.stdin.readline().split())
print(help(K,A,B))
```

## 03506

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03506 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        int ans = help(A);
        System.out.println(ans);
    }
    static int help(int[] A){
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for(int i=1;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(A[j]<A[i]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++) ans = Math.max(ans,dp[i]);
        return ans;
    }
}

```

python code:
```
import sys

def help(A):
    N = len(A)
    dp = [1]*N
    for i in range(1,N):
        for j in range(i):
            if A[j]<A[i]:
                dp[i] = max(dp[i],dp[j]+1)
    return max(dp)

N = int(sys.stdin.readline())
A = list(map(int,sys.stdin.readline().split()))
print(help(A))
```

## 03507

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03507 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        int ans = help(A);
        System.out.println(ans);
    }
    static int help(int[] A){
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for(int i=1;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(A[j]>A[i]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++) ans = Math.max(ans,dp[i]);
        return ans;
    }
}

```

python code:
```
import sys

def help(A):
    N = len(A)
    dp = [1]*N
    for i in range(1,N):
        for j in range(i):
            if A[j]>A[i]:
                dp[i] = max(dp[i],dp[j]+1)
    return max(dp)

N = int(sys.stdin.readline())
A = list(map(int,sys.stdin.readline().split()))
print(help(A))
```

## 03508

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03508 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        int ans = help(A);
        System.out.println(ans);
    }
    static int help(int[] A){
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for(int i=1;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(A[j]%A[i]==0) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++) ans = Math.max(ans,dp[i]);
        return ans;
    }
}

```

python code:
```
import sys

def help(A):
    N = len(A)
    dp = [1]*N
    for i in range(1,N):
        for j in range(i):
            if A[j]%A[i]==0:
                dp[i] = max(dp[i],dp[j]+1)
    return max(dp)

N = int(sys.stdin.readline())
A = list(map(int,sys.stdin.readline().split()))
print(help(A))
```

## 03509

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03509 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        int ans = help(A);
        System.out.println(ans);
    }
    static int help(int[] A){
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for(int i=1;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(A[j]%A[i]!=0) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++) ans = Math.max(ans,dp[i]);
        return ans;
    }
}

```

python code:
```
import sys

def help(A):
    N = len(A)
    dp = [1]*N
    for i in range(1,N):
        for j in range(i):
            if A[j]%A[i]!=0:
                dp[i] = max(dp[i],dp[j]+1)
    return max(dp)

N = int(sys.stdin.readline())
A = list(map(int,sys.stdin.readline().split()))
print(help(A))
```

## 03510

Translate the
