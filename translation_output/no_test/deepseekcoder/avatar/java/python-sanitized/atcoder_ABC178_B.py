import sys

def atcoder_ABC178_B():
    a, b, c, d = map(int, sys.stdin.readline().split())
    print(max(max(max(a * c, b * d), a * d), b * c))

atcoder_ABC178_B()