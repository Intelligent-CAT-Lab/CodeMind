

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }
        System.out.println(ans);
    }

    static int rec(int i, boolean isBlack, int k) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        if (isBlack) {
            return rec(i - 1, false, k) + rec(i - k, false, k);
        } else {
            return rec(i - 1, true, k);
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

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```
/2019/04/04/index.md
# 2019-04-04


## 1. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
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

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 5. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                ans++;
            }
       
