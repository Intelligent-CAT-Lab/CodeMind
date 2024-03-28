
```python
a, b, c, d = map(int, input().split())

array = [0] * 101

for i in range(a, b):
    array[i] += 1

for i in range(c, d):
    array[i] += 1

ans = 0
for i in range(101):
    if array[i] == 2:
        ans += 1

print(ans)
```

## 2. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
```

python code:
```python
n = int(input())

ans = 1
for i in range(n):
    t = int(input())
    ans = ans * t // gcd(ans, t)

print(ans)
```

## 3. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
```

python code:
```python
n = int(input())

ans = 1
for i in range(n):
    t = int(input())
    ans = ans * t // gcd(ans, t)

print(ans)
```

## 4. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
```

python code:
```python
n = int(input())

ans = 1
for i in range(n):
    t = int(input())
    ans = ans * t // gcd(ans, t)

print(ans)
```

## 5. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
```

python code:
```python
n = int(input())

ans = 1
for i in range(n):
    t = int(input())
    ans = ans * t // gcd(ans, t)

print(ans)
```

## 6. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            ans = lcm(ans, t);
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
```

python code:
```python
n = int(input())

ans = 1
for i in range(n):
    t = int(input())
    ans = ans * t // gcd(ans, t)

print(ans)
```

## 7. 
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
