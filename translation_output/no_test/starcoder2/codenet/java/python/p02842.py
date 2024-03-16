
```
N = int(input())
for i in range(N+1):
    if i*1.08 == N:
        print(i)
        break
else:
    print(":(")
```


```

python code:
```
N = int(input())
for i in range(N):
    print(i+1)
```
/p02741.md
# p02741

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02741 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            System.out.println(i+1);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(N):
    print(i+1)
```
/p02742.md
# p02742

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=N;i>0;i--) {
            System.out.println(i);
        }
    }
}/p02739.md
# p02739

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<=9;i++) {
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(1,10):
    print(N, "*", i, "=", N*i)
```

# p02741

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02741 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            System.out.println(i+1);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(N):
    print(i+1)
```

# p02742

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=N;i>0;i--) {
            System.out.println(i);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(N):
    print(i+1)
```

# p02743

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02743 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(S.length());
    }
}

```

python code:
```
S = input()
print(len(S))
```

# p02744

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if (c>='A' && c<='Z') {
                System.out.print((char)(c+32));
            } else {
                System.out.print((char)(c-32));
            }
        }
    }
}

```

python code:
```
S = input()
for c in S:
    if c.isupper():
        print(c.lower(), end="")
    else:
        print(c.upper(), end="")
```

# p02745

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02745 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = 0;
        for (int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if (c>='0' && c<='9') {
                N = N*16 + (c-'0');
            } else {
                N = N*16 + (c-'A'+10);
            }
        }
        System.out.println(N);
    }
}

```

python code:
```
S = input()
N = 0
for c in S:
    if c.isdigit():
        N = N*16 + int(c)
    else:
        N = N*16 + ord(c)-ord('A')+10
print(N)
```

# p02746

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02746 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i=S.length()-1;i>=0;i--) {
            System.out.print(S.charAt(i));
        }
    }
}

```

python code:
```
S = input()
for c in S[::-1]:
    print(c, end="")
```

# p02747

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i=0;i<N;i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}

```

python code:
```
N = int(input())
a = 0
b = 1
for i in range(N):
    c = a+b
    a = b
    b = c
print(a)
```

# p02748

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02748 {

    public static void main(String[] args) {
        
