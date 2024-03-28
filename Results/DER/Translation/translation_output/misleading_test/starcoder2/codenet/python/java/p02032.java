

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] prime = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            prime[i] = i;
        }
        prime[1] = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = 2 * i; j < n + 1; j += i) {
                prime[j] = 0;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i < n + 1; i++) {
            if (prime[i] != 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count != 0) {
                    map.put(i, count);
                }
            }
        }
        int ans = 1;
        for (int v : map.values()) {
            ans *= (v + 1);
        }
        System.out.println(map.size() + " " + (ans - 1));
    }
}
```

## 10. 
Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```
import sys
sys.setrecursionlimit(10 ** 5 + 10)
def input(): return sys.stdin.readline().strip()

def resolve():
    n=int(input())
    ans=0
    while n>0:
        ans+=n%10
        n//=10
    print(ans)
resolve()
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
```

## 11. 
Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```
import sys
sys.setrecursionlimit(10 ** 5 + 10)
def input(): return sys.stdin.readline().strip()

def resolve():
    n=int(input())
    ans=0
    while n>0:
        ans+=n%10
        n//=10
    print(ans)
resolve()
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
```

## 12. 
Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```
import sys
sys.setrecursionlimit(10 ** 5 + 10)
def input(): return sys.stdin.readline().strip()

def resolve():
    n=int(input())
    ans=0
    while n>0:
        ans+=n%10
        n//=
