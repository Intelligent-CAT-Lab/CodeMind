
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[][] ar = new char[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '#';
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '.';
            }
        }
        System.out.println("100 100");
        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        count = 0;
        for (int i = 99; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 2.

Write a program that takes a string and returns the number of vowels in the string.

```python
def vowel_count(s):
    count = 0
    for i in s:
        if i in "aeiou":
            count += 1
    return count
```

## 3.

Write a program that takes a string and returns the number of consonants in the string.

```python
def consonant_count(s):
    count = 0
    for i in s:
        if i not in "aeiou":
            count += 1
    return count
```

## 4.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 5.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 6.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 7.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 8.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 9.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```

## 10.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```


## 10.

Write a program that takes a string and returns the number of vowels and consonants in the string.

```python
def vowel_consonant_count(s):
    vowel = 0
    consonant = 0
    for i in s:
        if i in "aeiou":
            vowel += 1
        else:
            consonant += 1
    return vowel, consonant
```
# Python

## 1.

Write a program that takes a string and returns the number of vowels in the string.

```python
def vowel_count(s):
    count = 0
    for i in s:
        if i in "aeiou":
            count += 1
    return count
```

## 2.

Write a program that takes a string and returns the number of consonants in the string.

```python
def consonant_count(s):
    count = 0
    for i in s:
        if i not in "ae
