
```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```

## 1.2.2. 素数判定

素数判定を実装してください。

素数判定は、以下のように実装することができます。

```
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
```

## 1.2.3. 素因数分解

素因数分解を実装してください。

素因数分解は、以下のように実装することができます。

```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
```

## 1.2.4. 約数の列挙

約数の列挙を実装してください。

約数の列挙は、以下のように実装することができます。

```
def divisor(n):
    a = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            a.append(i)
            if i != n // i:
                a.append(n//i)
    return a
```

## 1.2.5. 最大公約数

最大公約数を実装してください。

最大公約数は、以下のように実装することができます。

```
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)
```

## 1.2.6. 最小公倍数

最小公倍数を実装してください。

最小公倍数は、以下のように実装することができます。

```
def lcm(a, b):
    return a * b // gcd(a, b)
```

## 1.2.7. 素数列挙

素数列挙を実装してください。

素数列挙は、以下のように実装することができます。

```
def prime_list(n):
    is_prime = [True] * (n + 1)
    is_prime[0] = False
    is_prime[1] = False
    for i in range(2, int(n**0.5) + 1):
        if not is_prime[i]:
            continue
        for j in range(i * 2, n + 1, i):
            is_prime[j] = False
    return [i for i in range(n + 1) if is_prime[i]]
```

## 1.2.8. 素因数分解

素因数分解を実装してください。

素因数分解は、以下のように実装することができます。

```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
```

## 1.2.9. 約数の列挙

約数の列挙を実装してください。

約数の列挙は、以下のように実装することができます。

```
def divisor(n):
    a = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            a.append(i)
            if i != n // i:
                a.append(n//i)
    return a
```

## 1.2.10. 最大公約数

最大公約数を実装してください。

最大公約数は、以下のように実装することができます。

```
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)
```

## 1.2.11. 最小公倍数

最小公倍数を実装してください。

最小公倍数は、以下のように実装することができます。

```
def lcm(a, b):
    return a * b // gcd(a, b)
```

## 1.2.12. 素数列挙

素数列挙を実装してください。

素数列挙は、以下のように実装することができます。

```
def prime_list(n):
    is_prime = [True] * (n + 1)
    is_prime[0] = False
    is_prime[1] = False
    for i in range(2, int(n**0.5) + 1):
        if not is_prime[i]:
            continue
        for j in range(i * 2, n + 1, i):
            is_prime[j] = False
    return [i for i in range(n + 1) if is_prime[i]]
```

## 1.2.13. 素因数分解

素因数分解を実装してください。

素因数分解は、以下のように実装することができます。

```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
```

## 1.2.14. 約数の列挙

約数の列挙を実装してください。

約数の列挙は、以下のように実装することができます。

```
def divisor(n):
    a = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            a.append(i)
            if i != n // i:
                a.append(n//i)
    return a
```

## 1.2.15. 最大公約数

最大公約数を実装してください。

最大公約数は、以下のように実装することができます。

```
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)
```

## 1.2.16. 最小公倍数

最小公倍数を実装してください。

最小公倍数は、以下のように実装することができます。

```
def lcm(a, b):
    return a * b
