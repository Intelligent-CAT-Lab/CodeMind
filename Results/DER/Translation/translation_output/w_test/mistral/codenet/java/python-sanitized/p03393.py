import sys

def solve():
    set = set('abcdefghijklmnopqrstuvwxyz')
    line = input()
    for ch in line:
        set.remove(ch)
    if len(set) > 0:
        print(line + set.pop())
    elif line == 'zyxwvutsrqponmlkjihgfedcba':
        print(-1)
    else:
        next(line, '')

def next(line, cur):
    if line.startswith(cur):
        return False
    if len(line) == len(cur):
        if line < cur:
            for i in range(len(line)):
                if line[i] != cur[i]:
                    return False
            print(''.join(cur))
            return True
        else:
            return False
    for ch in 'abcdefghijklmnopqrstuvwxyz':
        if ch not in cur:
            if next(line, cur + ch):
                return True
    return False

if __name__ == '__main__':
    solve()