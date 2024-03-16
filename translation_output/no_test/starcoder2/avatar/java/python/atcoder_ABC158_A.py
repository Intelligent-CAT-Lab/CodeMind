
```
str = input()
if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        long ans = N / (A + B) * A + Math.min(N % (A + B), A);
        System.out.println(ans);
    }
}
```

python code:
```
N, A, B = map(int, input().split())
ans = N // (A + B) * A + min(N % (A + B), A)
print(ans)
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC158_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = -1;
        for (int i = 0; i <= 1000; i++) {
            if (Math.floor(i * 0.08) == A && Math.floor(i * 0.1) == B) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
A, B = map(int, input().split())
ans = -1
for i in range(1001):
    if int(i * 0.08) == A and int(i * 0.1) == B:
        ans = i
        break
print(ans)
```

## 4.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC158_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        
        StringBuilder sb = new StringBuilder(S);
        boolean isReversed = false;
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                isReversed = !isReversed;
            } else {
                int F = sc.nextInt();
                String C = sc.next();
                if (F == 1) {
                    if (isReversed) {
                        sb.append(C);
                    } else {
                        sb.insert(0, C);
                    }
                } else {
                    if (isReversed) {
                        sb.insert(0, C);
                    } else {
                        sb.append(C);
                    }
                }
            }
        }
        if (isReversed) {
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}
```

python code:
```
S = input()
Q = int(input())

sb = S
isReversed = False
for i in range(Q):
    T = int(input())
    if T == 1:
        isReversed = not isReversed
    else:
        F, C = map(int, input().split())
        if F == 1:
            if isReversed:
                sb += C
            else:
                sb = C + sb
        else:
            if isReversed:
                sb = C + sb
            else:
                sb += C
if isReversed:
    sb = sb[::-1]
print(sb)
```
/atcoder/ABC158/ABC158_D.py
S = input()
Q = int(input())

sb = S
isReversed = False
for i in range(Q):
    T = int(input())
    if T == 1:
        isReversed = not isReversed
    else:
        F, C = map(int, input().split())
        if F == 1:
            if isReversed:
                sb += C
            else:
                sb = C + sb
        else:
            if isReversed:
                sb = C + sb
            else:
                sb += C
if isReversed:
    sb = sb[::-1]
print(sb)
/atcoder/ABC158/ABC158_C.py
A, B = map(int, input().split())
ans = -1
for i in range(1001):
    if int(i * 0.08) == A and int(i * 0.1) == B:
        ans = i
        break
print(ans)

/atcoder/ABC158/ABC158_A.py
str = input()
if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")/atcoder/ABC158/ABC158_B.py
N(A + B) * A + min(N % (A + B), A)
print(ans)
, A, B = map(int, input().split())
ans = N // 
