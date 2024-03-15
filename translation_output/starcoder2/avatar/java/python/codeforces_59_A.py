
```python
word = input()
uppercase = 0
lowercase = 0

for ch in word:
    if ch.isupper():
        uppercase += 1
    else:
        lowercase += 1

if uppercase > lowercase:
    print(word.upper())
elif lowercase > uppercase:
    print(word.lower())
else:
    print(word.lower())
```

## 2. 116A

### 2.1. Problem

[116A - Tram](https://codeforces.com/problemset/problem/116/A)

### 2.2. Solution

```python
n = int(input())

max_capacity = 0
current_capacity = 0

for i in range(n):
    a, b = map(int, input().split())
    current_capacity -= a
    current_capacity += b
    max_capacity = max(max_capacity, current_capacity)

print(max_capacity)
```

## 3. 118A

### 3.1. Problem

[118A - String Task](https://codeforces.com/problemset/problem/118/A)

### 3.2. Solution

```python
word = input()

vowels = 'aeiouy'

result = ''

for ch in word:
    if ch.lower() not in vowels:
        result += '.' + ch.lower()

print(result)
```

## 4. 131A

### 4.1. Problem

[131A - cAPS lOCK](https://codeforces.com/problemset/problem/131/A)

### 4.2. Solution

```python
word = input()

if word.isupper():
    print(word.lower())
elif word[0].islower() and word[1:].isupper():
    print(word[0].upper() + word[1:].lower())
else:
    print(word)
```

## 5. 133A

### 5.1. Problem

[133A - HQ9+](https://codeforces.com/problemset/problem/133/A)

### 5.2. Solution

```python
code = input()

if 'H' in code or 'Q' in code or '9' in code:
    print('YES')
else:
    print('NO')
```

## 6. 141A

### 6.1. Problem

[141A - Amusing Joke](https://codeforces.com/problemset/problem/141/A)

### 6.2. Solution

```python
guest = input()
host = input()
pile = input()

guest_count = [0] * 26
host_count = [0] * 26
pile_count = [0] * 26

for ch in guest:
    guest_count[ord(ch) - ord('A')] += 1

for ch in host:
    host_count[ord(ch) - ord('A')] += 1

for ch in pile:
    pile_count[ord(ch) - ord('A')] += 1

for i in range(26):
    if guest_count[i] + host_count[i] != pile_count[i]:
        print('NO')
        break
else:
    print('YES')
```

## 7. 158A

### 7.1. Problem

[158A - Next Round](https://codeforces.com/problemset/problem/158/A)

### 7.2. Solution

```python
n, k = map(int, input().split())

scores = list(map(int, input().split()))

threshold = scores[k - 1]

count = 0

for score in scores:
    if score >= threshold and score > 0:
        count += 1

print(count)
```

## 8. 160A

### 8.1. Problem

[160A - Twins](https://codeforces.com/problemset/problem/160/A)

### 8.2. Solution

```python
n = int(input())

coins = list(map(int, input().split()))

coins.sort(reverse=True)

total = sum(coins)

current_sum = 0
count = 0

for coin in coins:
    current_sum += coin
    count += 1
    if current_sum > total - current_sum:
        break

print(count)
```

## 9. 189A

### 9.1. Problem

[189A - Cut Ribbon](https://codeforces.com/problemset/problem/189/A)

### 9.2. Solution

```python
n, a, b, c = map(int, input().split())

dp = [-1] * (n + 1)
dp[0] = 0

for i in range(1, n + 1):
    if i - a >= 0 and dp[i - a] != -1:
        dp[i] = max(dp[i], dp[i - a] + 1)
    if i - b >= 0 and dp[i - b] != -1:
        dp[i] = max(dp[i], dp[i - b] + 1)
    if i - c >= 0 and dp[i - c] != -1:
        dp[i] = max(dp[i], dp[i - c] + 1)

print(dp[n])
```

## 10. 231A

### 10.1. Problem

[231A - Team](https://codeforces.com/problemset/problem/231/A)

### 10.2. Solution

```python
n = int(input())

count = 0

for i in range(n):
    a, b, c = map(int, input().split())
    if a + b + c >= 2:
        count += 1

print(count)
```

## 11. 263A

### 11.1. Problem

[263A - Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)

### 11.2. Solution

```python
for i in range(5):
    row = list(map(int, input().split()))
    if 1 in row:
        print(abs(i - 2) + abs(row.index(1) - 2))
        break
```

## 12. 266A

### 12.1. Problem

[266A - Stones on the Table](https://codeforces.com/problemset/problem/266/A)

### 12.2. Solution

```python
n = int(input())
stones = input()

count = 0

for i in range(1, n):
    if stones[i] == stones[i - 1]:
        count += 1

print(count)
```

## 13. 281A

### 13.1. Problem

[281A - Word Capitalization](https://codeforces.com/problemset/problem/281/A)

### 13.2. Solution

```python
word = input()

print(word[0].upper() + word
