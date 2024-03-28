
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static List<String> f(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 1) {
            ans.add("a");
            return ans;
        }
        List<String> prev = f(n - 1);
        for (String s : prev) {
            int m = s.charAt(s.length() - 1) - 'a';
            for (int i = 0; i <= m + 1; i++) {
                ans.add(s + (char) (i + 'a'));
            }
        }
        return ans;
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
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 10.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 11.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 12.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```

## 13.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new
