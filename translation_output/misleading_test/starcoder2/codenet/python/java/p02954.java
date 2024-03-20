
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc++;
                    if (i == n - 1 || s.charAt(i + 1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i + 1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (s.charAt(i) == 'L') {
                    lc++;
                    if (i == n - 1 || s.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
beggh
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String ans = "";
        String tmp = "";
        for (int i = 0; i < n; i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                tmp += s.charAt(i);
            } else {
                if (tmp.length() > ans.length()) {
                    ans = tmp;
                }
                tmp = s.charAt(i) + "";
            }
        }
        if (tmp.length() > ans.length()) {
            ans = tmp;
        }
        System.out.println(ans);
    }
}
```
/2020/04/20200420.md
# 20200420

## 1. 
Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a % 2 == 1 && a > max) {
                max = a;
            }
        }
        if (max == -1) {
            System.out.println("no odd number");
        } else {
            System.out.println(max);
        }
    }
}
```

## 2. 
Write a program that asks the user to input any positive integer and then prints the sum of all the odd numbers from 1 to that number.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
Write a program that asks the user to input any positive integer and then prints the sum of all the even numbers from 2 to that number (inclusive).

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 5. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that end in 5.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 5) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3 or end in 5.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 5) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 
