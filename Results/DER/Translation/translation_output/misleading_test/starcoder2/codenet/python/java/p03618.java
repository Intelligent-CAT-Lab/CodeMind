

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        int l = s_arr.length;
        int res = l * (l - 1) / 2 + 1;
        int i = 0;
        while (i < l) {
            int j = i;
            while (j < l && s_arr[j] == s_arr[i]) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}

```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def vowel_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels)
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(s):
    vowels = 'aeiou'
    return sum(s.count(c) for c in s if c not in vowels)
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels)
```

## 5.

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```
def vowel_consonant_space_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' ')
```

## 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```
def vowel_consonant_space_digit_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit())
```

## 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum())
```

## 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, and words in the string.

```
def vowel_consonant_space_digit_special_word_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum()), len(s.split())
```

## 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, words, and sentences in the string.

```
def vowel_consonant_space_digit_special_word_sentence_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum()), len(s.split()), len(s.split('.'))
```

## 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, words, sentences, and paragraphs in the string.

```
def vowel_consonant_space_digit_special_word_sentence_paragraph_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum()), len(s.split()), len(s.split('.')), len(s.split('\n'))
```

## 11.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, words, sentences, paragraphs, and lines in the string.

```
def vowel_consonant_space_digit_special_word_sentence_paragraph_line_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum()), len(s.split()), len(s.split('.')), len(s.split('\n')), len(s.split('\n'))
```

## 12.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, words, sentences, paragraphs, lines, and characters in the string.

```
def vowel_consonant_space_digit_special_word_sentence_paragraph_line_character_count(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), len(s) - sum(s.count(c) for c in s if c.isalnum()), len(s.split()), len(s.split('.')), len(s.split('\n')), len(s.split('\n')), len(s)
```

## 13.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, words, sentences, paragraphs, lines, characters, and bytes in the string.

```
def vowel_consonant_space_digit_special_word_sentence_paragraph_line_character_byte_count(s):
    vowels = 'aeiou'
    return sum(
