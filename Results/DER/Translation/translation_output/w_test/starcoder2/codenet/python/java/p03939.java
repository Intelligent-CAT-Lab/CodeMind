

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        System.out.println(ret);
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
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3. 
Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:
abbbccddddd

Expected output:
ddddd

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
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
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5. 
Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:
abbbccddddd

Expected output:
ddddd

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
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
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7. 
Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:
abbbccddddd

Expected output:
ddddd

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 8. 
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
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9. 
Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:
abbbccddddd

Expected output:
ddddd

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 10. 
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
        for (
