
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts[i-1] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Ts[i];
        }
        System.out.println(sum - mini);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

bobbobbob

Expected output:

3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that prints the longest substring of a string in which the letters occur in alphabetical order.

Test input:

azcbobobegghakl

Expected output:

beggh

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
                current = s.substring(i, i+1);
            } else if (s.charAt(i) >= s.charAt(i-1)) {
                current += s.substring(i, i+1);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = s.substring(i, i+1);
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

Write a program that prints the number of times the string 'bob' occurs in s.

Test input:

azcbobobegghakl

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

Test input:

azcbobobegghakl

Expected output:

beggh

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
                current = s.substring(i, i+1);
            } else if (s.charAt(i) >= s.charAt(i-1)) {
                current += s.substring(i, i+1);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = s.substring(i, i+1);
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

Write a program that prints the number of times the string 'bob' occurs in s.

Test input:

azcbobobegghakl

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

Test input:

azcbobobegghakl

Expected output:

beggh

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
                current = s.substring(i, i+1);
            } else if (s.charAt(i) >= s.charAt(i-1)) {
                current += s.substring(i, i+1);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = s.substring(i, i+1);
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

Write a program that prints the number of times the string 'bob' occurs in s.

Test input:

azcbobobegghakl

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

Test input:

azcbobobegghakl

Expected output:

beggh

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
                current = s.substring(i, i+1);
            } else if (s.charAt(i) >= s.charAt(i-1)) {
                current += s.substring(i, i+1);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = s.substring(i, i+1
