
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(-(-N/2)/N);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N*M*K);
    }
}
```
/01-basic-syntax/01-basic-syntax.md
# Basic Syntax

## 1. Printing

### 1.1. Printing a string

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World!

Expected output:
Hello World!

```
print("Hello World!")
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### 1.2. Printing a number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
print(123456789)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(123456789);
    }
}
```

### 1.3. Printing a string and a number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World!
123456789

Expected output:
Hello World!
123456789

```
print("Hello World!")
print(123456789)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(123456789);
    }
}
```

## 2. Variables

### 2.1. Declaring a variable

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = 123456789
print(N)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        int N = 123456789;
        System.out.println(N);
    }
}
```

### 2.2. Declaring multiple variables

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = 123456789
M = 123456789
K = 123456789
print(N)
print(M)
print(K)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        int N = 123456789;
        int M = 123456789;
        int K = 123456789;
        System.out.println(N);
        System.out.println(M);
        System.out.println(K);
    }
}
```

### 2.3. Declaring multiple variables in one line

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = M = K = 123456789
print(N)
print(M)
print(K)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        int N = 123456789;
        int M = N;
        int K = N;
        System.out.println(N);
        System.out.println(M);
        System.out.println(K);
    }
}
```

## 3. Input

### 3.1. Input a number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = int(input())
print(N)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

### 3.2. Input multiple numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = int(input())
M = int(input())
K = int(input())
print(N)
print(M)
print(K)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N);
        System.out.println(M);
        System.out.println(K);
    }
}
```

### 3.3. Input multiple numbers in one line

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N, M, K = map(int, input().split())
print(N)
print(M)
print(K)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);
        System.out.println(N);
        System.out.println(M);
        System.out.println(K);
    }
}
```

## 4. Arithmetic Operations

### 4.1. Addition

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
N = int(input())
print(N+N)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N+N);
    }
}
```

### 4.2. Subtraction

Translate the following python code to
