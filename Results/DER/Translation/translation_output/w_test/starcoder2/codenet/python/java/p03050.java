
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int)Math.sqrt(N);
        int[] plist = new int[n];
        int i = 0;
        for (i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[i] = i;
                if (i != N / i) {
                    plist[i] = N / i;
                }
            }
        }
        int ans = 0;
        for (i = 0; i < plist.length; i++) {
            int x = plist[i];
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```
/2019/04/04.md
# 2019/04/04

## 1.

Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                if (n > max) {
                    max = n;
                }
            }
        }
        if (max == 0) {
            System.out.println("No odd number was entered.");
        } else {
            System.out.println(max);
        }
    }
}
```

## 2.

Write a program that asks the user to input any number of integers, and then prints the sum of the even numbers only.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that asks the user to input any number of integers, and then prints the number of positive numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that asks the user to input any number of integers, and then prints the number of negative numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that asks the user to input any number of integers, and then prints the number of zeros that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                count++;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that asks the user to input any number of integers, and then prints the number of positive even numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0 && n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that asks the user to input any number of integers, and then prints the number of negative odd numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0 && n % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.

Write a program that asks the user to input any number of integers, and then prints the number of positive odd numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0 && n % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that asks the user to input any number of integers, and then prints the number of negative even numbers that were entered.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0 && n
