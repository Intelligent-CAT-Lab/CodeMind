

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        int[] ans = new int[50];
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = a + 50 - b + i + 1;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.
