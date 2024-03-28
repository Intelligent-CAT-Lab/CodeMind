
```
N = int(input())
for h in range(1, 3501):
    for n in range(1, 3501):
        if 4*h*n-N*n-N*h != 0 and (N*h*n)/(4*h*n-N*n-N*h) > 0 and (N*h*n)%(4*h*n-N*n-N*h) == 0:
            print(h, n, int((N*h*n)/(4*h*n-N*n-N*h)))
            exit()
```

## 03590

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03590 {
    
    public static void main(String[] args) {
        new p03590().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long ans=0;
        for(long i=1;i<=N;i++) {
            ans+=i;
        }
        System.out.println(ans);
    }
}

```

python code:
```
N = int(input())
ans = 0
for i in range(1, N+1):
    ans += i
print(ans)
```

## 03591

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03591 {
    
    public static void main(String[] args) {
        new p03591().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long ans=0;
        for(long i=1;i<=N;i++) {
            ans+=i*i;
        }
        System.out.println(ans);
    }
}

```

python code:
```
N = int(input())
ans = 0
for i in range(1, N+1):
    ans += i*i
print(ans)
```


## 03588

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03588 {
    
    public static void main(String[] args) {
        new p03588().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long ans=0;
        for(long i=1;i<=N;i++) {
            ans+=i*i*i;
        }
        System.out.println(ans);
    }
}

```

python code:
```
N = int(input())
ans = 0
for i in range(1, N+1):
    ans += i*i*i
print(ans)
```

## 03589

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -65

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03589 {
    
    public static void main(String[] args) {
        new p03589().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        for(long h=1;h<=3500;h++) {
            for(long n=1;n<=3500;n++) {
                if(4*h*n-N*n-N*h!=0 && (N*h*n)/(4*h*n-N*n-N*h)>0 && (N*h*n)%(4*h*n-N*n-N*h)==0) {
                    System.out.println(h+" "+n+" "+(N*h*n)/(4*h*n-N*n-N*h));
                    return;
                }
            }
        }
    }
}

```

python code:
```
N = int(input())
for h in range(1, 3501):
    for n in range(1, 3501):
        if 4*h*n-N*n-N*h != 0 and (N*h*n)/(4*h*n-N*n-N*h) > 0 and (N*h*n)%(4*h*n-N*n-N*h) == 0:
            print(h, n, int((N*h*n)/(4*h*n-N*n-N*h)))
            exit()
```

## 03590

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03590 {
    
    public static void main(String[] args) {
        new p03590().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long ans=0;
        for(long i=1;i<=N;i++) {
            ans+=i
