import sys

def atcoder_ABC127_B():
    r = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())

    for _ in range(10):
        x = r * x - d
        print(x)

atcoder_ABC127_B()