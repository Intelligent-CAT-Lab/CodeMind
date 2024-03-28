import sys

def solve(s):
    good = ["dream", "dreamer", "erase", "eraser"]
    poss = [False]*(len(s)+1)
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
                poss[i+len(out)] = True
    return "YES" if poss[len(s)] else "NO"

def main():
    qq = 1
    for casenum in range(1, qq+1):
        s = sys.stdin.readline().strip()
        print(solve(s))

if __name__ == "__main__":
    main()