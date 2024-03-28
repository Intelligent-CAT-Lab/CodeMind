

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/(g*g));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

```

---

### 2.

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

---

### 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(string):
    vowels = "aeiou"
    count = 0
    for letter in string:
        if letter not in vowels and letter.isalpha():
            count += 1
    return count

```

---

### 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
    return count

```

---

### 5.

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```
def vowel_consonant_space_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
    return count

```

---

### 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```
def vowel_consonant_space_digit_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
    return count

```

---

### 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 11.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 12.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def vowel_consonant_space_digit_special_count(string):
    vowels = "aeiou"
    count = {"vowels": 0, "consonants": 0, "spaces": 0, "digits": 0, "special": 0}
    for letter in string:
        if letter in vowels:
            count["vowels"] += 1
        elif letter.isalpha():
            count["consonants"] += 1
        elif letter == " ":
            count["spaces"] += 1
        elif letter.isdigit():
            count["digits"] += 1
        else:
            count["special"] += 1
    return count

```

---

### 1
