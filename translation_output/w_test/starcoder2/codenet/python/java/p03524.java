

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] frq = new int[3];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a') {
                frq[0]++;
            } else if (c == 'b') {
                frq[1]++;
            } else if (c == 'c') {
                frq[2]++;
            }
        }
        int max = frq[0];
        int min = frq[0];
        for (int i = 1; i < 3; i++) {
            if (frq[i] > max) {
                max = frq[i];
            }
            if (frq[i] < min) {
                min = frq[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 2. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 4. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 5. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 6. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 7. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 8. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 9. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 10. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 11. 
Write a program to find the sum of all the numbers in a given string.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.
