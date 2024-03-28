

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] a1 = a.toCharArray();
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == '?') {
                a1[i] = 'D';
            }
        }
        String b = new String(a1);
        System.out.println(b);
    }
}
```

## Question 2

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 5

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```


```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 5

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Assignment-1

## Question 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPJDPDP

```
a=input()

a=list(a)

for i in range(len(a)):
    if a[i]=="?":
        a[i]="D"

b=""
for i in range(len(a)):
    b+=a[i]

print(b)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] a1 = a.toCharArray();
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == '?') {
                a1[i] = 'D';
            }
        }
        String b = new String(a1);
        System.out.println(b);
    }
}
```

## Question 2

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;

public class Main {
    public static void main(String[]
