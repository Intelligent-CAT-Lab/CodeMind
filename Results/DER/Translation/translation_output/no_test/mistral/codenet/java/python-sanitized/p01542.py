import sys

def calc(s):
    stack = []
    for c in s:
        if c == '(':
            stack.append(c)
        elif c == ')':
            if not stack or stack.pop() != '(':
                return -1
        elif c in '0123456789':
            stack.append(c)
        elif c in '+-*/':
            if not stack or stack.pop() not in '0123456789':
                return -1
    if stack:
        return -1
    return int(s)

def dfs(s, i):
    if i == len(s):
        return max(calc(s), 0)
    if s[i] == '.':
        return max(dfs(s, i+1) + calc(s[i:i+2]), dfs(s, i+1))
    else:
        return max(dfs(s, i+1), dfs(s, i+1))

def solve(s):
    s += '$'
    cs = s.split('.')
    max = -1
    for i in range(len(cs)):
        dfs(cs, i)
    return max

if __name__ == '__main__':
    s = input()
    print(solve(s))