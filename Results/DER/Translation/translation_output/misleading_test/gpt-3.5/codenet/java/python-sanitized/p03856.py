import sys

def read_line():
    return sys.stdin.readline().strip()

def solve():
    s = read_line()
    good = ["dream", "dreamer", "erase", "eraser"]
    poss = [False] * (len(s) + 1)
    poss[0] = True

    for i in range(len(s)):
        if not poss[i]:
            continue
        for out in good:
            if i + len(out) > len(s):
                continue
            match = 0
            for a in range(len(out)):
                if out[a] == s[i+a]:
                    match += 1
            if match == len(out):
                poss[i + len(out)] = True
    print("YES" if poss[len(s)] else "NO")

if __name__ == "__main__":
    solve()