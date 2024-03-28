
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buf = sc.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        int thres = (int) Math.pow(10, 9) + 7;
        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            int retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (int) Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal = retVal % thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            int retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (int) Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}
```

## 2. 
Write a program to find the sum of all the numbers in a given string.

Test input:
123456789

Expected output:
45

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program to find the sum of all the numbers in a given string.

Test input:
123456789

Expected output:
45

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program to find the sum of all the numbers in a given string.

Test input:
123456789

Expected output:
45

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Practice

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-80

```
buf=input().split()
N=int(buf[0])
M=int(buf[1])

thres=10**9+7

if abs(N-M)==1:
    N=min(N,M)
    retVal=1
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    retVal*=(N+1)
    if retVal>=thres:
        retVal=retVal%thres
    print(retVal) 
elif N==M:
    retVal=2
    for i in range(1,N+1):
        retVal*=(i**2)
        if retVal>=thres:
            retVal=retVal%thres
    print(retVal)
else:
    print(0)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buf = sc.nextLine().split(" ");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        int thres = (int) Math.pow(10, 9) + 7;
        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            int retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (int) Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            retVal *= (N + 1);
            if (retVal >= thres) {
                retVal = retVal % thres;
            }
            System.out.println(retVal);
        } else if (N == M) {
            int retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (int) Math.pow(i, 2);
                if (retVal >= thres) {
                    retVal = retVal % thres;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
    }
}
```

## 2. 
Write a program to find the sum of all the numbers in a given string.

Test input:
123456789

Expected output:
45

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program to find the sum of all the numbers in a given string.

Test input:
123456789

Expected output:
45

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String
