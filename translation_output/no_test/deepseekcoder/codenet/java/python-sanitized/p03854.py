import re

def solve():
    S = input()
    S = re.sub('eraser|erase|dreamer|dream', '-', S)
    S = re.sub('-', '', S)
    if len(S) == 0:
        print("YES")
    else:
        print("NO")

solve()