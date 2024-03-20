

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int df_int = Integer.parseInt(df);
            int sm_int = Integer.parseInt(sm);
            if ((df_int + sm_int) % 2 == 0 && sm_int >= df_int && (sm_int - df_int) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
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

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```java
public static int[] countVowelsConsonantsAndSpaces(String s) {
    int[] count = new int[3];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            count[1]++;
        } else {
            count[2]++;
        }
    }
    return count;
}
```

## 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```java
public static int[] countVowelsConsonantsSpacesAndDigits(String s) {
    int[] count = new int[4];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            if (Character.isDigit(c)) {
                count[3]++;
            } else {
                count[1]++;
            }
        } else {
            count[2]++;
        }
    }
    return count;
}
```

## 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```java
public static int[] countVowelsConsonantsSpacesDigitsAndSpecialCharacters(String s) {
    int[] count = new int[5];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            if (Character.isDigit(c)) {
                count[3]++;
            } else if (Character.isLetter(c)) {
                count[1]++;
            } else {
                count[4]++;
            }
        } else {
            count[2]++;
        }
    }
    return count;
}
```

## 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, and uppercase letters in the string.

```java
public static int[] countVowelsConsonantsSpacesDigitsSpecialCharactersAndUppercaseLetters(String s) {
    int[] count = new int[6];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            if (Character.isDigit(c)) {
                count[3]++;
            } else if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    count[5]++;
                } else {
                    count[1]++;
                }
            } else {
                count[4]++;
            }
        } else {
            count[2]++;
        }
    }
    return count;
}
```

## 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, and lowercase letters in the string.

```java
public static int[] countVowelsConsonantsSpacesDigitsSpecialCharactersUppercaseLettersAndLowercaseLetters(String s) {
    int[] count = new int[7];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            if (Character.isDigit(c)) {
                count[3]++;
            } else if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    count[5]++;
                } else {
                    count[6]++;
                }
            } else {
                count[4]++;
            }
        } else {
            count[2]++;
        }
    }
    return count;
}
```

## 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, and words in the string.

```java
public static int[] countVowelsConsonantsSpacesDigitsSpecialCharactersUppercaseLettersLowercaseLettersAndWords(String s) {
    int[] count = new int[8];
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count[0]++;
        } else if (c != ' ') {
            if (Character.isDigit
