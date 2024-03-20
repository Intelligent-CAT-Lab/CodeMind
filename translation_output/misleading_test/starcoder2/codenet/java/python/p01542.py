

```python
import sys

def calc(s):
    stack = []
    for c in s:
        if c == '(':
            stack.append(c)
        elif c == ')':
            if len(stack) == 0:
                return -1
            if stack[-1] == '(':
                stack.pop()
            else:
                return -1
        elif c == '+' or c == '-' or c == '*':
            if len(stack) == 0:
                return -1
            if stack[-1] == '(':
                stack.append(c)
            else:
                return -1
        else:
            if len(stack) == 0:
                return -1
            if stack[-1] == '(':
                stack.append(c)
            else:
                return -1
    if len(stack) == 0:
        return 0
    else:
        return -1

def dfs(s, i):
    if i == len(s):
        return calc(s)
    if s[i] == '.':
        s[i] = '0'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '1'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '+'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '-'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '*'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '('
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = ')'
        ret = dfs(s, i + 1)
        if ret != -1:
            return ret
        s[i] = '.'
        return -1
    else:
        return dfs(s, i + 1)

s = sys.stdin.readline().strip()
s += '$'
s = list(s)
print(dfs(s, 0))
```

## 01543 - 문서 검색

### 문제

- [01543 - 문서 검색](https://www.acmicpc.net/problem/1543)

### 풀이

- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력받아서 문자열을 찾는 문제
- 문자열을 입력
