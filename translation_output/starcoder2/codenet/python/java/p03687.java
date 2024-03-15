
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        int[] o = new int[26];
        for (int i = 0; i < 26; i++) {
            int j = 0;
            int m = 0;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) - 'a' == i) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[i] = m;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                min = Math.min(min, o[i]);
            }
        }
        System.out.println(min);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 3.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 4.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 5.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```
/2019-2020/01/01/README.md
# 2019-2020 1st semester 1st week

## 1.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 3.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 4.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                System.out.println((char)('a' + i) + " " + c[i]);
            }
        }
    }
}
```

## 5.

Write a program that reads a string and prints the number of times each character appears in the string.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
