

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (Math.pow(2, d) <= l) {
            d++;
        }
        d--;
        int n = d + 1;
        int m = 2 * d;
        int[][] ans = new int[m][3];
        for (int i = 1; i < n; i++) {
            ans[i - 1][0] = i;
            ans[i - 1][1] = i + 1;
            ans[i - 1][2] = 0;
            ans[i + n - 2][0] = i;
            ans[i + n - 2][1] = i + 1;
            ans[i + n - 2][2] = (int) Math.pow(2, i - 1);
        }
        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans[m][0] = i;
                    ans[m][1] = n;
                    ans[m][2] = (int) (l - Math.pow(2, i - 1));
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }
        System.out.println(n + " " + m);
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}
```

## 3.

Write a function that takes a string and returns the number of vowels in the string.

```python
def count_vowels(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels])
```

## 4.

Write a function that takes a string and returns the number of consonants in the string.

```python
def count_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c not in vowels])
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 10.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 11.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 12.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 13.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 14.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 15.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 16.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels])
```

## 17.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```python
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum([1 for c in s if c in vowels]), sum([1 for c in s if c not in vowels
