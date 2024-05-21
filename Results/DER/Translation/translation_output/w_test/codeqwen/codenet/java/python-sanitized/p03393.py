import sys

def solve():
    set_ = set('abcdefghijklmnopqrstuvwxyz')
    line = input()
    for ch in line:
        set_.remove(ch)
    if len(set_) > 0:
        print(line + set_.pop())
        return
    if line == 'zyxwvutsrqponmlkjihgfedcba':
        print(-1)
        return
    next_(line, '')

def next_(line, cur):
    if line[:len(cur)] > cur:
        return False
    if len(line) == len(cur):
        if line < cur:
            for i in range(len(line)):
                print(cur[i], end='')
                if line[i] != cur[i]:
                    break
            print()
            return True
        else:
            return False
    for ch in 'abcdefghijklmnopqrstuvwxyz':
        if ch not in cur:
            if next_(line, cur + ch):
                return True
    return False

if __name__ == '__main__':
    start = sys.perf_counter()
    solve()
    sys.stdout.flush()
    end = sys.perf_counter()
    if _bElapsed:
        print((end - start) * 1000, 'ms')