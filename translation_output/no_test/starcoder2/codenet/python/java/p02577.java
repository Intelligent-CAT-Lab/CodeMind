
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.substring(i, i + 1))) % 9;
        }
        System.out.println(tmp == 0 ? "Yes" : "No");
    }
}
```

## 2.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:
```
bobbobbob
```
the output should be:
```
3
```

java code:
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
        System.out.println(count);
    }
}
```

## 3.
Write a program that reads a string and prints the longest substring of the string that consists of the same letter. For example, if the input is:
```
aaabbbbccccc
```
the output should be:
```
ccccc
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String maxStr = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                tmp += s.charAt(i);
            } else {
                if (tmp.length() > max) {
                    max = tmp.length();
                    maxStr = tmp;
                }
                tmp = s.charAt(i) + "";
            }
        }
        if (tmp.length() > max) {
            max = tmp.length();
            maxStr = tmp;
        }
        System.out.println(maxStr);
    }
}
```

## 4.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 5.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 6.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 7.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 8.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 9.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 10.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
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
        System.out.println(count);
    }
}
```

## 11.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:
```
azcbobobegghakl
```
the output should be:
```
2
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
