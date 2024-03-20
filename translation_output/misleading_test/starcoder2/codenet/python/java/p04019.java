

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s1 = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == 'N' || s1[i] == 'S' || s1[i] == 'E' || s1[i] == 'W') {
                count++;
            }
        }
        if (count == 4) {
            System.out.println("Yes");
        } else if (count == 3) {
            System.out.println("No");
        } else if (count == 2) {
            if ((s1[0] == 'N' && s1[1] == 'S') || (s1[0] == 'E' && s1[1] == 'W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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
        for (int i = 2; i < n; i++) {
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

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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
        for (int i = 2; i < n; i++) {
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

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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
        for (int i = 2; i < n; i++) {
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

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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
        for (int i = 2; i < n; i++) {
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

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```

def main():
    count = 0
    sum = 0
    i = 2
    while count < 1000:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    print(sum)

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

if __name__=='__main__':
    main()
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 
