import sys

def solve(s):
    s = "$" + s + "$"
    ans = 0
    s = list(s)
    for i in range(1, len(s) - 1):
        if s[i] == "O" and s[i - 1] != "O":
            s0 = i
        if s[i] == "O" and s[i + 1] != "O":
            l = i - s0 + 1
            if s0 >= l and len(s) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if s[s0 - 1 - j] != "J" or s[i + 1 + j] != "I":
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    return ans

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))