

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                int cnt = 0;
                while (x % i == 0) {
                    cnt++;
                    x /= i;
                }
                int s = 0;
                int num = cnt;
                if (num == 1) {
                    ans += 1;
                } else {
                    for (int j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            ans += j;
                            break;
                        } else if (s > num) {
                            ans += j - 1;
                            break;
                        }
                    }
                }
            }
        }
        if (x != 1) {
            ans += 1;
        }
        if (ans == 0) {
            ans += x;
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false
