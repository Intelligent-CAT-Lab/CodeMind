

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X1 = 0;
        int Y1 = 0;
        int tmp = (int) Math.sqrt(S);
        int X2 = 0;
        int Y3 = 0;
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }
        int rest = X2 * X2 - S;
        int X3 = 0;
        int Y2 = 0;
        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1000000000) {
                X3 = 1;
                Y2 = rest;
            } else {
                for (int i = 2; i <= (int) Math.sqrt(rest) + 2; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                    }
                }
            }
        }
        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1. 
Write a program to find the sum of the first 1000 prime numbers.

python code:

```python
sum = 0
count = 0
i = 2
while count < 1000:
    if isPrime(i):
        sum += i
        count += 1
    i += 1
print(sum)

def isPrime(n):
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-2.md
# 2019-2020-1-2

## 1. 
Write a program to find the sum of the first 1000 prime numbers.

python code:

```python
sum = 0
count = 0
i = 2
while count < 1000:
    if isPrime(i):
        sum += i
        count += 1
    i += 1
print(sum)

def isPrime(n):
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 4. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 5. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 6. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
public class Main {
    public static
