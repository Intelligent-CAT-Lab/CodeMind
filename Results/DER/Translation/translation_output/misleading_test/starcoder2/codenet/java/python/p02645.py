

```python
s = input()
print(s[0:3])
```

## 2.

Write a python program to find the length of the string "refrigerator"

```python
s = "refrigerator"
print(len(s))
```

## 3.

Write a python program to get a string from a given string where all occurrences of its first char have been changed to '$', except the first char itself.

```python
s = input()
print(s[0] + s[1:].replace(s[0], '$'))
```

## 4.

Write a python program to get a single string from two given strings, separated by a space and swap the first two characters of each string.

```python
s1 = input()
s2 = input()
print(s2[0:2] + s1[2:] + ' ' + s1[0:2] + s2[2:])
```

## 5.

Write a python program to add 'ing' at the end of a given string (length should be at least 3). If the given string already ends with 'ing' then add 'ly' instead. If the string length of the given string is less than 3, leave it unchanged.

```python
s = input()
if len(s) < 3:
    print(s)
elif s[-3:] == 'ing':
    print(s + 'ly')
else:
    print(s + 'ing')
```

## 6.

Write a python program to find the first appearance of the substring 'not' and 'poor' from a given string, if 'not' follows the 'poor', replace the whole 'not'...'poor' substring with 'good'. Return the resulting string.

```python
s = input()
if 'not' in s and 'poor' in s and s.index('not') < s.index('poor'):
    print(s[:s.index('not')] + 'good' + s[s.index('poor') + 4:])
else:
    print(s)
```

## 7.

Write a python program to remove the characters which have odd index values of a given string.

```python
s = input()
print(s[::2])
```

## 8.

Write a python program to count the occurrences of each word in a given sentence.

```python
s = input()
words = s.split()
for word in words:
    print(word, words.count(word))
```

## 9.

Write a python program to convert a given string to all uppercase if it contains at least 2 uppercase characters in the first 4 characters.

```python
s = input()
if s[:4].count(s[:4].upper()) >= 2:
    print(s.upper())
else:
    print(s)
```

## 10.

Write a python program to sort a string lexicographically.

```python
s = input()
print(''.join(sorted(s)))
```

## 11.

Write a python program to remove a newline.

```python
s = input()
print(s.replace('\n', ''))
```

## 12.

Write a python program to check whether a string starts with specified characters.

```python
s = input()
print(s.startswith('Py'))
```

## 13.

Write a python program to create a Caesar encryption.

```python
s = input()
print(s.translate(str.maketrans('abcdefghijklmnopqrstuvwxyz', 'defghijklmnopqrstuvwxyzabc')))
```

## 14.

Write a python program to display formatted text (width=50) as output.

```python
s = input()
print(s.center(50))
```

## 15.

Write a python program to remove existing indentation from all of the lines in a given text.

```python
s = input()
print(s.lstrip())
```

## 16.

Write a python program to print the following floating numbers upto 2 decimal places.

```python
print('{:.2f}'.format(1.23456))
print('{:.2f}'.format(123.4567898))
print('{:.2f}'.format(1234.5))
```

## 17.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 18.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 19.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 20.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 21.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 22.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 23.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 24.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 25.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 26.

Write a python program to print the following floating numbers with no decimal places.

```python
print('{:.0f}'.format(1.23456))
print('{:.0f}'.format(123.4567898))
print('{:.0f}'.format(1234.5))
```

## 27.

Write a python program to print the following floating
