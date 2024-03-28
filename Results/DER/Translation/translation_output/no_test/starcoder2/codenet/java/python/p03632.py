
```
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(max(0, end - start))
```

## 2. 10814

### 2.1. Problem

[https://www.acmicpc.net/problem/10814](https://www.acmicpc.net/problem/10814)

### 2.2. Solution

```
import sys

members = []
for line in sys.stdin:
    age, name = line.split()
    members.append((int(age), name))

for member in sorted(members):
    print(member[0], member[1])
```

## 3. 10825

### 3.1. Problem

[https://www.acmicpc.net/problem/10825](https://www.acmicpc.net/problem/10825)

### 3.2. Solution

```
import sys

members = []
for line in sys.stdin:
    name, kor, eng, math = line.split()
    members.append((name, int(kor), int(eng), int(math)))

for member in sorted(members, key=lambda x: (-x[1], x[2], -x[3], x[0])):
    print(member[0])
```

## 4. 10828

### 4.1. Problem

[https://www.acmicpc.net/problem/10828](https://www.acmicpc.net/problem/10828)

### 4.2. Solution

```
import sys

stack = []
for line in sys.stdin:
    cmd = line.split()
    if cmd[0] == 'push':
        stack.append(int(cmd[1]))
    elif cmd[0] == 'pop':
        print(stack.pop() if stack else -1)
    elif cmd[0] == 'size':
        print(len(stack))
    elif cmd[0] == 'empty':
        print(0 if stack else 1)
    elif cmd[0] == 'top':
        print(stack[-1] if stack else -1)
```

## 5. 10845

### 5.1. Problem

[https://www.acmicpc.net/problem/10845](https://www.acmicpc.net/problem/10845)

### 5.2. Solution

```
import sys

queue = []
for line in sys.stdin:
    cmd = line.split()
    if cmd[0] == 'push':
        queue.append(int(cmd[1]))
    elif cmd[0] == 'pop':
        print(queue.pop(0) if queue else -1)
    elif cmd[0] == 'size':
        print(len(queue))
    elif cmd[0] == 'empty':
        print(0 if queue else 1)
    elif cmd[0] == 'front':
        print(queue[0] if queue else -1)
    elif cmd[0] == 'back':
        print(queue[-1] if queue else -1)
```

## 6. 10866

### 6.1. Problem

[https://www.acmicpc.net/problem/10866](https://www.acmicpc.net/problem/10866)

### 6.2. Solution

```
import sys

deque = []
for line in sys.stdin:
    cmd = line.split()
    if cmd[0] == 'push_front':
        deque.insert(0, int(cmd[1]))
    elif cmd[0] == 'push_back':
        deque.append(int(cmd[1]))
    elif cmd[0] == 'pop_front':
        print(deque.pop(0) if deque else -1)
    elif cmd[0] == 'pop_back':
        print(deque.pop() if deque else -1)
    elif cmd[0] == 'size':
        print(len(deque))
    elif cmd[0] == 'empty':
        print(0 if deque else 1)
    elif cmd[0] == 'front':
        print(deque[0] if deque else -1)
    elif cmd[0] == 'back':
        print(deque[-1] if deque else -1)
```

## 7. 10808

### 7.1. Problem

[https://www.acmicpc.net/problem/10808](https://www.acmicpc.net/problem/10808)

### 7.2. Solution

```
import sys

alphabet = [0] * 26
for c in sys.stdin.readline().strip():
    alphabet[ord(c) - ord('a')] += 1

print(' '.join(map(str, alphabet)))
```

## 8. 10809

### 8.1. Problem

[https://www.acmicpc.net/problem/10809](https://www.acmicpc.net/problem/10809)

### 8.2. Solution

```
import sys

alphabet = [-1] * 26
for i, c in enumerate(sys.stdin.readline().strip()):
    if alphabet[ord(c) - ord('a')] == -1:
        alphabet[ord(c) - ord('a')] = i

print(' '.join(map(str, alphabet)))
```

## 9. 10820

### 9.1. Problem

[https://www.acmicpc.net/problem/10820](https://www.acmicpc.net/problem/10820)

### 9.2. Solution

```
import sys

for line in sys.stdin:
    lower = 0
    upper = 0
    digit = 0
    space = 0
    for c in line:
        if c.islower():
            lower += 1
        elif c.isupper():
            upper += 1
        elif c.isdigit():
            digit += 1
        elif c.isspace():
            space += 1
    print(lower, upper, digit, space)
```

## 10. 11654

### 10.1. Problem

[https://www.acmicpc.net/problem/11654](https://www.acmicpc.net/problem/11654)

### 10.2. Solution

```
import sys

print(ord(sys.stdin.readline().strip()))
```

## 11. 11655

### 11.1. Problem

[https://www.acmicpc.net/problem/11655](https://www.acmicpc.net/problem/11655)

### 11.2. Solution

```
import sys

for c in sys.stdin.readline().strip():
    if c.islower():
        print(chr(ord('a') + (ord(c) - ord('a') + 13) % 26), end='')
    elif c.isupper():
        print(chr(ord('A') + (ord(c) - ord('A') + 13) % 26), end='')
    else:
        print(c, end='')
```

## 12. 11720

### 12.1. Problem

[https://www.acmicpc.net/problem/11720](https://www.acmicpc.net/problem/117
