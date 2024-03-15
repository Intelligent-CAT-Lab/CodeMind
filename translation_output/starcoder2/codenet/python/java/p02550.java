
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        HashSet<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr.get(i), 2) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i);
        }
        if (h != -1) {
            ArrayList<Integer> new_arr = new ArrayList<>();
            for (int i = arr.indexOf(r); i < arr.size(); i++) {
                new_arr.add(arr.get(i));
            }
            int rest = n - (h + 1);
            int c = new_arr.size();
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < new_arr.size(); i++) {
                ssum += new_arr.get(i);
            }
            ssum *= q;
            int r1 = rest % c;
            for (int i = 0; i < r1; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }
        System.out.println(res);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```python
def count_vowels(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels)
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```python
def count_consonants(s):
    vowels = 'aeiou'
    return sum(s.count(c) for c in s if c not in vowels)
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels)
```

## 5.

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```python
def count_vowels_consonants_spaces(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' ')
```

## 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```python
def count_vowels_consonants_spaces_digits(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit())
```

## 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), sum(s.count(c) for c in s if c not in vowels and c not in ' ' and not c.isdigit())
```

## 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), sum(s.count(c) for c in s if c not in vowels and c not in ' ' and not c.isdigit())
```

## 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), sum(s.count(c) for c in s if c not in vowels and c not in ' ' and not c.isdigit())
```

## 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), sum(s.count(c) for c in s if c not in vowels and c not in ' ' and not c.isdigit())
```

## 11.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(s.count(d) for d in s if d.isdigit()), sum(s.count(c) for c in s if c not in vowels and c not in ' ' and not c.isdigit())
```

## 12.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```python
def count_vowels_consonants_spaces_digits_special(s):
   
