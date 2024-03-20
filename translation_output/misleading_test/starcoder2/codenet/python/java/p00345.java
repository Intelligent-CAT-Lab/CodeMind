

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int o = s.indexOf('.');
        int p = s.indexOf('(');
        int d = s.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        if (p == -1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '.') {
                    all += s.charAt(i);
                }
            }
            System.out.println(all + "/" + (int)Math.pow(10, d));
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '.' && s.charAt(i) != '(' && s.charAt(i) != ')') {
                    if (i < p) {
                        all += s.charAt(i);
                    } else {
                        sub += s.charAt(i);
                    }
                }
            }
            d -= 2;
            System.out.println((Integer.parseInt(all) - Integer.parseInt(sub)) + "/" + (int)Math.pow(10, d) - (int)Math.pow(10, l));
        }
    }
}
```

## 2.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
```

## 3.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
```

## 4.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(0));
        }
    }
}
```

## 5.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1));
        }
    }
}
```

## 6.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0));
        }
    }
}
```

## 7.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + words[i].charAt(words[i].length() - 1));
        }
    }
}
```

## 8.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + " ");
        }
    }
}
```

## 9.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + " ");
        }
    }
}
```

## 10.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + " ");
        }
    }
}
```

## 11.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) + " ");
        }
    }
}
```

## 12.

Write a program that takes a string as input and prints the string in reverse order.
