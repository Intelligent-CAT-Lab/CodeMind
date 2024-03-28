import sys

def main():
    s = sys.stdin.readline().strip()
    s = '$' + s + '$'
    ans = 0
    s = 0
    for i in range(1, len(s)):
        if s == 0 and s[i] == 'O':
            s = i
        if s!= 0 and s[i] == 'O':
            l = i - s + 1
            if s >= l and len(s) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if s[s - 1 - j]!= 'J' or s[i + 1 + j]!= 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

if __name__ == '__main__':
    main()