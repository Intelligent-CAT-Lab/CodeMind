import sys

def run():
    c = sys.stdin.readline().strip()
    n = len(c)
    s = ""
    for i in range(n):
        if c[i] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
            s += c[i]
    c = s.strip()
    n = len(c)
    s = ""
    for i in range(n):
        if not s or s[-1] != c[i]:
            s += c[i]
    if len(s) > 0 and s[0] == 'Z':
        s = s[1:]
    if len(s) > 0 and s[-1] == 'A':
        s = s[:-1]
    if len(s) > 0:
        print(s)
    else:
        print(-1)

if __name__ == "__main__":
    run()