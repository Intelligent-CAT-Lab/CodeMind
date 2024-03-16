
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};
        for (int i = 0; i < s.length(); i += 2) {
            boolean flag = false;
            for (int j = 0; j < odd.length; j++) {
                if (s.charAt(i) == odd[j].charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            boolean flag = false;
            for (int j = 0; j < even.length; j++) {
                if (s.charAt(i) == even[j].charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Example:
```
String:
bobbobbob
Number of times bob occurs is: 3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Example:
```
String:
azcbobobegghakl
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current += s.charAt(i);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = "" + s.charAt(i);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Example:
```
String:
azcbobobegghakl
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
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Example:
```
String:
azcbobobegghakl
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current += s.charAt(i);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = "" + s.charAt(i);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Example:
```
String:
azcbobobegghakl
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
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Example:
```
String:
azcbobobegghakl
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current += s.charAt(i);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = "" + s.charAt(i);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 8.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Example:
```
String:
azcbobobegghakl
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
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that reads a string and prints the longest substring
