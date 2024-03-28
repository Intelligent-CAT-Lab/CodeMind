
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] n_arr = n.toCharArray();
        int lb = 0, ub = n_arr.length;
        int[] n_int = new int[n_arr.length];
        for (int i = 0; i < n_arr.length; i++) {
            n_int[i] = n_arr[i] - '0';
        }
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n_int)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, int[] n) {
        int g = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            x -= (x + g - n[i]) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =
