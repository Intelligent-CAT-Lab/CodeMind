import sys

a, b, c = map(int, input().split())
d = a + b
e = -1
for i in range(1000):
    if 0 <= (60 * i + c) % d <= a:
        e = i
        break
if e == -1:
    print(-1)
else:
    print(60 * e + c)
sys.stdout.flush()