import sys

def p02124():
    ans = "ai1333"
    x = int(sys.stdin.readline())
    for i in range(x//100):
        ans += "3"
    print(ans)

p02124()