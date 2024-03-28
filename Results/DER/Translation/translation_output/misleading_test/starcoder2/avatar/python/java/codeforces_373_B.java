

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int w = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int k = Integer.parseInt(lines[2]);
        int max_length = 0;
        int available_digits = w / k;
        while (available_digits > 0) {
            int current_cost_per_n = String.valueOf(m).length();
            int same_cost_until = (int) Math.pow(10, current_cost_per_n);
            int usable_numbers = same_cost_until - m;
            int use_digits = usable_numbers * current_cost_per_n;
            m = same_cost_until;
            if (available_digits >= use_digits) {
                max_length += usable_numbers;
                available_digits -= use_digits;
            } else {
                max_length += available_digits / current_cost_per_n;
                available_digits = 0;
            }
        }
        System.out.println(max_length);
    }
}

```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def vowel_count(string):
    # your code here
```

```
def vowel_count(string):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0
    for char in string:
        if char in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(string):
    # your code here
```

```
def consonant_count(string):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0
    for char in string:
        if char not in vowels and char.isalpha():
            count += 1
    return count
```

## 4.

Write a function that takes a string and returns the number of special characters in the string.

```
def special_count(string):
    # your code here
```

```
def special_count(string):
    count = 0
    for char in string:
        if not char.isalnum():
            count += 1
    return count
```

## 5.

Write a function that takes a string and returns the number of digits in the string.

```
def digit_count(string):
    # your code here
```

```
def digit_count(string):
    count = 0
    for char in string:
        if char.isdigit():
            count += 1
    return count
```

## 6.

Write a function that takes a string and returns the number of words in the string.

```
def word_count(string):
    # your code here
```

```
def word_count(string):
    return len(string.split())
```

## 7.

Write a function that takes a string and returns the number of unique words in the string.

```
def unique_word_count(string):
    # your code here
```

```
def unique_word_count(string):
    return len(set(string.split()))
```

## 8.

Write a function that takes a string and returns the number of characters in the string.

```
def character_count(string):
    # your code here
```

```
def character_count(string):
    return len(string)
```

## 9.

Write a function that takes a string and returns the number of characters in the string without counting spaces.

```
def character_count_without_spaces(string):
    # your code here
```

```
def character_count_without_spaces(string):
    return len(string.replace(' ', ''))
```

## 10.

Write a function that takes a string and returns the number of characters in the string without counting spaces or special characters.

```
def character_count_without_spaces_or_special_characters(string):
    # your code here
```

```
def character_count_without_spaces_or_special_characters(string):
    return len(string.replace(' ', '').strip('!@#$%^&*()_+{}:"<>?[]\|'))
```

## 11.

Write a function that takes a string and returns the number of characters in the string without counting spaces or special characters or digits.

```
def character_count_without_spaces_or_special_characters_or_digits(string):
    # your code here
```

```
def character_count_without_spaces_or_special_characters_or_digits(string):
    return len(string.replace(' ', '').strip('!@#$%^&*()_+{}:"<>?[]\|').strip('0123456789'))
```

## 12.

Write a function that takes a string and returns the number of characters in the string without counting spaces or special characters or digits or vowels.

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels(string):
    # your code here
```

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels(string):
    return len(string.replace(' ', '').strip('!@#$%^&*()_+{}:"<>?[]\|').strip('0123456789').strip('aeiou'))
```

## 13.

Write a function that takes a string and returns the number of characters in the string without counting spaces or special characters or digits or vowels or consonants.

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels_or_consonants(string):
    # your code here
```

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels_or_consonants(string):
    return len(string.replace(' ', '').strip('!@#$%^&*()_+{}:"<>?[]\|').strip('0123456789').strip('aeiou').strip('bcdfghjklmnpqrstvwxyz'))
```

## 14.

Write a function that takes a string and returns the number of characters in the string without counting spaces or special characters or digits or vowels or consonants or words.

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels_or_consonants_or_words(string):
    # your code here
```

```
def character_count_without_spaces_or_special_characters_or_digits_or_vowels_or_consonants_or_words(string):
    return len(string.replace(' ', '').strip('!@#$%^&*()_+{}:"<>?[]\|').strip('0123456789').strip('aeiou').strip('bcdfghjklmnpqrst
