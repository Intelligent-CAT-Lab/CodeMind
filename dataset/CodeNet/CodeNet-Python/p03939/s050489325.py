import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))