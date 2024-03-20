
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j <= B - A) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
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

the output is:

```
ccccc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String maxStr = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (temp.length() == 0) {
                temp += s.charAt(i);
            } else if (temp.charAt(0) == s.charAt(i)) {
                temp += s.charAt(i);
            } else {
                if (temp.length() > max) {
                    max = temp.length();
                    maxStr = temp;
                }
                temp = s.charAt(i) + "";
            }
        }
        if (temp.length() > max) {
            max = temp.length();
            maxStr = temp;
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

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 5. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 7. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 9. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
        System.out.println(count);
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
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
                count
