

```java
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        foo(a, b, c);
    }

    public static void foo(int a, int b, int c) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```java
public static int countVowels(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
}
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```java
public static int countConsonants(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            count++;
        }
    }
    return count;
}
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 10.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 11.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 12.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            result[0]++;
        } else {
            result[1]++;
        }
    }
    return result;
}
```

## 13.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] result = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
