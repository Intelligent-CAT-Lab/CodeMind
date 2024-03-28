

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

    public static int rec(int i, boolean isBlack, int k) {
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
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        String ansStr = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count > ans) {
                    ans = count;
                    ansStr = s.substring(i - count + 1, i + 1);
                }
                count = 1;
            }
        }
        if (count > ans) {
            ans = count;
            ansStr = s.substring(s.length() - count, s.length());
        }
        System.out.println(ansStr);
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

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
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        String ansStr = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count > ans) {
                    ans = count;
                    ansStr = s.substring(i - count + 1, i + 1);
                }
                count = 1;
            }
        }
        if (count > ans) {
            ans = count;
            ansStr = s.substring(s.length() - count, s.length());
        }
        System.out.println(ansStr);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

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

## 7. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        String ansStr = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count > ans) {
                    ans = count;
                    ansStr = s.substring(i - count + 1, i + 1);
                }
                count = 1;
            }
        }
        if (count > ans) {
            ans = count;
            ansStr = s.substring(s.length() - count, s.length());
        }
        System.out.println(ansStr);
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

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

## 9. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

