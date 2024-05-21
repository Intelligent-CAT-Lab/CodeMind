import sys

N = int(input())
x = 0
y = 0
out = [0] * 11  # 1000000000000001 <= 26^10ã¨ã¡ãã£ã¨ãããï¼ãªã®ãã¾111æ¡

for i in range(11):
    N = N - 1
    x = N // 26
    y = N % 26
    out[i] = chr(ord('a') + y)
    if x == 0:
        break
    N = x

for i in range(10, -1, -1):
    if out[i] == 0:
        continue
    sys.stdout.write(out[i])