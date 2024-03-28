
```
import sys

def main():
    str = sys.stdin.readline().strip()
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str[ptr] == '>':
            while ptr < n and str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += curr + ((cnt * (cnt - 1)) // 2)
            else:
                sum += ((cnt + 1) * cnt) // 2
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str[n - 1] == '<':
        sum += curr
    print(sum)

main()
```
/p10000/p10000.md
# Problem 10000

## Summary

Given a list of words, find the word that occurs the most.

## Input

The first line of input contains a single integer $n$ ($1 \leq n \leq 100000$), the number of words.

Each of the next $n$ lines contains a single word. Each word is a string of lowercase letters. The total length of all words is at most $100000$.

## Output

Output the word that occurs the most. If there are multiple words that occur the most, output the word that comes first alphabetically.

## Sample Input

```
5
a
b
c
d
e
```

## Sample Output

```
a
```

## Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    words = [sys.stdin.readline().strip() for _ in range(n)]
    counts = {}
    for word in words:
        if word not in counts:
            counts[word] = 0
        counts[word] += 1
    max_count = 0
    max_word = ''
    for word in counts:
        if counts[word] > max_count:
            max_count = counts[word]
            max_word = word
        elif counts[word] == max_count and word < max_word:
            max_word = word
    print(max_word)

main()
```

## Notes

This problem is a good example of how to use a dictionary.

The first step is to read in the words. We can do this with a list comprehension.

```python
words = [sys.stdin.readline().strip() for _ in range(n)]
```

The next step is to count the number of times each word occurs. We can do this with a dictionary.

```python
counts = {}
for word in words:
    if word not in counts:
        counts[word] = 0
    counts[word] += 1
```

The last step is to find the word that occurs the most. We can do this by iterating through the dictionary and keeping track of the word with the highest count.

```python
max_count = 0
max_word = ''
for word in counts:
    if counts[word] > max_count:
        max_count = counts[word]
        max_word = word
    elif counts[word] == max_count and word < max_word:
        max_word = word
```

The last line of the code prints the word that occurs the most.

## Alternative Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    words = [sys.stdin.readline().strip() for _ in range(n)]
    counts = {}
    for word in words:
        counts[word] = counts.get(word, 0) + 1
    max_count = 0
    max_word = ''
    for word in counts:
        if counts[word] > max_count:
            max_count = counts[word]
            max_word = word
        elif counts[word] == max_count and word < max_word:
            max_word = word
    print(max_word)

main()
```

## Notes

This solution is similar to the first solution, but it uses a different method to count the number of times each word occurs. Instead of using an if statement to check if the word is in the dictionary, it uses the get method of the dictionary.

The get method takes two arguments: the key and the default value. If the key is in the dictionary, it returns the value associated with the key. If the key is not in the dictionary, it returns the default value.

In this case, the default value is 0, which is the value associated with the key if the key is not in the dictionary. This means that the get method returns the number of times the word has been seen so far.

The rest of the code is the same as the first solution.

## Alternative Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    words = [sys.stdin.readline().strip() for _ in range(n)]
    counts = {}
    for word in words:
        counts[word] = counts.get(word, 0) + 1
    max_count = 0
    max_word = ''
    for word in counts:
        if counts[word] > max_count:
            max_count = counts[word]
            max_word = word
        elif counts[word] == max_count and word < max_word:
            max_word = word
    print(max_word)

main()
```

## Notes

This solution is similar to the first solution, but it uses a different method to count the number of times each word occurs. Instead of using an if statement to check if the word is in the dictionary, it uses the get method of the dictionary.

The get method takes two arguments: the key and the default value. If the key is in the dictionary, it returns the value associated with the key. If the key is not in the dictionary, it returns the default value.

In this case, the default value is 0, which is the value associated with the key if the key is not in the dictionary. This means that the get method returns the number of times the word has been seen so far.

The rest of the code is the same as the first solution.

## Alternative Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    words = [sys.stdin.readline().strip() for _ in range(n)]
    counts = {}
    for word in words:
        counts[word] = counts.get(word, 0) + 1
    max_count = 0
    max_word = ''
    for word in counts:
        if counts[word] > max_count:
            max_count = counts[word]
            max_word = word
        elif counts[word] == max_count and word < max_word:
            max_word = word
    print(max_word)

main()
```

## Notes

This solution is similar to the first solution, but it uses a different method to count the number of times each word occurs. Instead of using an if statement to check if the word is in the dictionary, it uses the get method of the dictionary.

The get method takes two arguments: the key and the default value. If the key is in the dictionary, it returns the value associated with the key. If the key is not in the dictionary, it returns the default value.

In this case, the default value is 0, which is the value associated with the key if the key is not in the dictionary. This means that the get method returns the number of times the word has been seen so far.

The rest of the code is the
