
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }
        System.out.println(ret);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```java
public static int countVowels(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count[0]++;
        } else {
            count[1]++;
        }
    }
    return count;
}
```


## 1.

Write a function that takes a string and returns the number of vowels in the string.

```java
public static int countVowels(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count++;
        }
    }
    return count;
}
```

## 2.

Write a function that takes a string and returns the number of consonants in the string.

```java
public static int countConsonants(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
            count++;
        }
    }
    return count;
}
```

## 3.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```java
public static int[] countVowelsAndConsonants(String s) {
    int[] count = new int[2];
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count[0]++;
        } else {
            count[1]++;
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
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
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
        if (s.charAt(i) == 'a' || s.charAt(i) == '
