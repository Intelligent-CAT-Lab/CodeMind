import sys

def atcoder_ABC143_A():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    if A - (B * 2) > 0:
        print(A - (B * 2))

atcoder_ABC143_A()