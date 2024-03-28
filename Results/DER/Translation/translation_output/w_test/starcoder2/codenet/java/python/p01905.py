

```python
N,M = map(int,input().split())
a = list(map(int,input().split()))
b = [True for i in range(N*2-1)]
for i in range(M):
    b[a[i]+N-1] = False
for i in range(N*2-2,0,-2):
    if b[i] and b[i-1]:
        b[(i-2)//2] = True
    elif b[i] or b[i-1]:
        b[(i-2)//2] = True
    else:
        b[(i-2)//2] = False
ans = 0
for i in range(N-1):
    if b[i*2+1] and b[i*2+2]:
        ans += 1
print(ans)
```
/source/_posts/2018-08-20-python-list-comprehension.md
---
title: Python List Comprehension
date: 2018-08-20 15:00:00
tags: [python]
---

# List Comprehension

List comprehension is a way to create a list in Python.

## Syntax

```
[expression for item in list]
```

## Example

```python
>>> a = [1, 2, 3, 4, 5]
>>> b = [i for i in a if i >= 3]
>>> b
[3, 4, 5]
```

## Nested List Comprehension

```python
>>> a = [1, 2, 3, 4, 5]
>>> b = [i for i in a if i >= 3]
>>> b
[3, 4, 5]
```

## Reference

[https://www.programiz.com/python-programming/list-comprehension](https://www.programiz.com/python-programming/list-comprehension)
/source/_posts/2018-08-20-python-dictionary.md
---
title: Python Dictionary
date: 2018-08-20 15:00:00
tags: [python]
---

# Dictionary

Dictionary is a collection of key-value pairs.

## Syntax

```
{key: value}
```

## Example

```python
>>> a = {'a': 1, 'b': 2, 'c': 3}
>>> a
{'a': 1, 'b': 2, 'c': 3}
```

## Accessing Values

```python
>>> a = {'a': 1, 'b': 2, 'c': 3}
>>> a['a']
1
```

## Updating Dictionary

```python
>>> a = {'a': 1, 'b': 2, 'c': 3}
>>> a['a'] = 10
>>> a
{'a': 10, 'b': 2, 'c': 3}
```

## Deleting Dictionary Elements

```python
>>> a = {'a': 1, 'b': 2, 'c': 3}
>>> del a['a']
>>> a
{'b': 2, 'c': 3}
```

## Dictionary Methods

| Method | Description |
| --- | --- |
| clear() | Removes all the elements from the dictionary |
| copy() | Returns a copy of the dictionary |
| fromkeys(seq[, v]) | Returns a new dictionary with keys from seq and value equal to v (defaults to None) |
| get(key[,d]) | For key key, returns value or default if key not in dictionary |
| items() | Returns a list of dict's (key, value) tuple pairs |
| keys() | Returns list of dictionary's keys |
| pop(key[,d]) | Removes key from dict and returns its value or d if key not found |
| popitem() | Removes and returns an arbitrary (key, value) pair from the dictionary |
| setdefault(key[,d]) | Similar to get(), but will set dict[key]=default if key is not already in dict |
| update(dict2) | Adds dictionary dict2's key-values pairs to an existing dictionary |
| values() | Returns list of dictionary's values |

## Reference

[https://www.programiz.com/python-programming/dictionary](https://www.programiz.com/python-programming/dictionary)

[https://www.tutorialspoint.com/python/python_dictionary.htm](https://www.tutorialspoint.com/python/python_dictionary.htm)

[https://www.tutorialspoint.com/python/dictionary_clear.htm](https://www.tutorialspoint.com/python/dictionary_clear.htm)

[https://www.tutorialspoint.com/python/dictionary_copy.htm](https://www.tutorialspoint.com/python/dictionary_copy.htm)

[https://www.tutorialspoint.com/python/dictionary_fromkeys.htm](https://www.tutorialspoint.com/python/dictionary_fromkeys.htm)

[https://www.tutorialspoint
