import sys

def main():
    s = sys.stdin.readline().strip()
    l = len(s)
    if s[0] == '0' or s[-1] == '1':
        print(-1)
        return
    for i in range(l//2):
        if s[i] != s[-i-1]:
            print(-1)
            return
    print(1, 2)
    for i in range(3, l+1):
        print(i-1, i)

main()