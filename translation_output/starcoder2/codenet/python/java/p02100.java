
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();
        int cur = 0;
        int[] P = new int[6];
        while (cur < L) {
            char op = '+';
            while (true) {
                term(op);
                if (cur == L) {
                    break;
                }
                op = S.charAt(cur);
                cur++;
            }
        }
        int d = 5;
        while (P[d] == 0) {
            d--;
        }
        int[] R = new int[2000];
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R[x] = x;
            }
        }
        for (int i = 0; i < R.length; i++) {
            if (R[i] != 0) {
                System.out.print("(x" + R[i] + ")");
            }
        }
    }

    public static void term(char op) {
        int cur = 0;
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == "x") {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == "^") {
                cur++;
                d = num();
            }
        }
        P[d] = k;
    }

    public static int num() {
        int cur = 0;
        int v = 0;
        while (cur < L && S.charAt(cur) in "0123456789") {
            v = 10 * v + int(S.charAt(cur));
            cur++;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (x ^ i);
        }
        return res;
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(x):
    return x*x

def g(x):
    return x+1

def h(x):
    return x-1

def f1(x):
    return f(g(h(x)))

print(f1(1))
```

java code:
```
public class Main {
    public static void main(String[] args) {
        System.out.println(f1(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int f1(int x) {
        return f(g(h(x)));
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(x):
    return x*x

def g(x):
    return x+1

def h(x):
    return x-1

def f1(x):
    return f(g(h(x)))

print(f1(1))
```

java code:
```
public class Main {
    public static void main(String[] args) {
        System.out.println(f1(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int f1(int x) {
        return f(g(h(x)));
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(x):
    return x*x

def g(x):
    return x+1

def h(x):
    return x-1

def f1(x):
    return f(g(h(x)))

print(f1(1))
```

java code:
```
public class Main {
    public static void main(String[] args) {
        System.out.println(f1(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int f1(int x) {
        return f(g(h(x)));
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(x):
    return x*x

def g(x):
    return x+1

def h(x):
    return x-1

def f1(x):
    return f(g(h(x)))

print(f1(1))
```

java code:
```
public class Main {
    public static void main(String[] args) {
        System.out.println(f1(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int f1(int x) {
        return f(g(h(x)));
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
def f(x):
    return x*x

def g(x):
    return x+1

def h(x):
    return x-1

def f1(x):
    return f(g(h(x)))

print(f1(1))
```

java code:
```
public class Main {
    public static void main(String[] args) {
        System.out.println(f1(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int f1(int x) {
        return f(g(h(x)));
    }
}
```
/2019-2020/2019-2020-1/20
