

```python
import sys

def main():
    str = sys.stdin.readline().strip()
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str[ptr] == '>':
            while ptr < n and str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += curr + ((cnt * (cnt - 1)) // 2)
            else:
                sum += ((cnt + 1) * cnt) // 2
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str[n - 1] == '<':
        sum += curr
    print(sum)

main()
```

## Problem 2874

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
import java.io.*;

public class p02874 {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int[] ans = new int[m];
        int ptr = 0;
        int cnt = 0;
        while(ptr < n){
            if(cnt == m){
                cnt = 0;
            }
            ans[cnt] = arr[ptr];
            cnt++;
            ptr++;
        }
        for(int i = 0; i < m; i++){
            out.print(ans[i] + " ");
        }
        out.println();
        out.close();
    }
}

```

python code:

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    arr = [i + 1 for i in range(n)]
    ans = [0 for i in range(m)]
    ptr = 0
    cnt = 0
    while ptr < n:
        if cnt == m:
            cnt = 0
        ans[cnt] = arr[ptr]
        cnt += 1
        ptr += 1
    print(*ans)

main()
```

## Problem 2875

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 6 1

Expected output:
3

```
import java.util.*;
import java.io.*;

public class p02875 {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;
        while(n >= 2 && m >= 1 && k > 0){
            n-=2;
            m--;
            k--;
            ans++;
        }
        out.println(ans);
        out.close();
    }
}

```

python code:

```python
import sys

def main():
    n, m, k = map(int, sys.stdin.readline().split())
    ans = 0
    while n >= 2 and m >= 1 and k > 0:
        n -= 2
        m -= 1
        k -= 1
        ans += 1
    print(ans)

main()
```

## Problem 2876

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
import java.io.*;

public class p02876 {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int[] ans = new int[m];
        int ptr = 0;
        int cnt = 0;
        while(ptr < n){
            if(cnt == m){
                cnt = 0;
            }
            ans[cnt] = arr[ptr];
            cnt++;
            ptr++;
        }
        for(int i = 0; i < m; i++){
            out.print(ans[i] + " ");
        }
        out.println();
        out.close();
    }
}

```

python code:

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    arr = [i + 1 for i in range(n)]
    ans = [0 for i in range(m)]
    ptr = 0
    cnt = 0
    while ptr < n:
        if cnt == m:
            cnt = 0
        ans[cnt] = arr[ptr]
        cnt += 1
        ptr += 1
    print(*ans)

main()
```

## Problem 2877

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
import java.io.*;

public class p02877 {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int[] ans = new int[m];
        int ptr = 0;
        int cnt = 0;
        while(ptr < n){
            if(cnt == m){
                cnt = 0;
            }
            ans[cnt] = arr[ptr];
            cnt++;
            ptr++;
        }
        for(int i = 0; i < m; i++){
            out.print(ans[i] + " ");
        }
        out.println();
        out.close();
    }
}

```

python code:

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    arr = [i + 1 for i in range(n)]
    ans = [0 for i in range(m)]
    ptr = 0
   
