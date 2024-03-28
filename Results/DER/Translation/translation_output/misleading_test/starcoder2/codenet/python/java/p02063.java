

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B % A == 0) {
            System.out.println(-1);
            return;
        }
        int _k = -(-B / A);
        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}

```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def vowel_count(string):
    vowels = "aeiou"
    count = 0
    for letter in string:
        if letter in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(string):
    vowels = "aeiou"
    count = 0
    for letter in string:
        if letter not in vowels:
            count += 1
    return count
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 10.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 11.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 12.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 13.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 14.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 15.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0
    for letter in string:
        if letter in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    return vowel_count, consonant_count
```

## 16.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def v
