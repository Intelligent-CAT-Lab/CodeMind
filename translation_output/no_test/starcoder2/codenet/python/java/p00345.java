
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String all = "";
        String sub = "";
        int p = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }
        int d = S.length() - o - 1;
        int l = p - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2;
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }
}
```

## 2.

### 2.1

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.2

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.3

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.4

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.5

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.6

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.7

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.8

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.9

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.10

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose(f, g), h)(3))
print(compose(compose(f, compose(g, h)), compose(f, g))(3))
```

### 2.11

```
def f(x):
    return x + 1

def g(x):
    return x * 2

def h(x):
    return x - 3

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(3))
print(compose(f, compose(g, h))(3))
print(compose(compose
