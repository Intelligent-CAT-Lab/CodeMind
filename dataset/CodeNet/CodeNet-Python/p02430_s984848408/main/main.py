import sys
readline = sys.stdin.readline
write = sys.stdout.write
N, K = list(map(int, readline().split()))

R = []
v = (1 << K) - 1
while v < (1 << N):
    R.append(v)
    x = v & -v; y = v + x
    v = ((v & ~y) // x >> 1) | y
R.sort()
for i in R:
    write("%d: %s\n" % (i, " ".join(str(j) for j in range(N) if i & (1 << j))))

