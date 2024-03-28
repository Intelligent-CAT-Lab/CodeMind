import sys

def solve():
    set = set()
    for char in 'abcdefghijklmnopqrstuvwxyz':
        set.add(char)
    line = input()
    for char in line:
        set.remove(char)
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
            for i in range(len(cur)):
                if line[i] != cur[i]:
                    return False
            print(cur)
            return True
        else:
            return False
    for char in 'abcdefghijklmnopqrstuvwxyz':
        if char not in cur:
            if next(line, cur + char):
                return True
    return False

if __name__ == '__main__':
    solve()