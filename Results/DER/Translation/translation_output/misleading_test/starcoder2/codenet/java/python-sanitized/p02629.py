import sys

N = int(input())

x = N - 1
y = x % 26

out = []

while x != 0:
    out.append(chr(y + ord('a')))
    x = x // 26
    y = x % 26

out.append(chr(y + ord('a')))

print(''.join(out[::-1]))