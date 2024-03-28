
```java
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int lS = S.length();
        int[] d = new int[26];
        for (int i = 0; i < lS; i++) {
            d[S.charAt(i) - 'a']++;
        }
        int dd = 0;
        for (int i = 0; i < 26; i++) {
            if (d[i] % 2 == 1) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i = 0; i < 26; i++) {
                if (d[i] != 0) {
                    dnm = dnm.multiply(factorial(d[i] / 2));
                }
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
```

## 2.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 3.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 4.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 5.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 6.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 7.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 8.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output:

a 3
b 2
c 1
```

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] d = new int[26];
        for (int i = 0; i < S.length(); i++) {
            d[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (d[i] != 0) {
                System.out.println((char) (i + 'a') + " " + d[i]);
            }
        }
    }
}
```

## 9.

Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

aaabbc

Sample Output
