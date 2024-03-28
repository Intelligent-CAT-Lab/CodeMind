import sys

r, c, h, w = map(int, input().split())

if r % h == 0 and c % w == 0:
    print("No")
    sys.exit()

mcnt = (r // h) * (c // w)
space = r * c - ((r // h) * h) * ((c // w) * w)

plus_number = ((mcnt + space) // space) + 1
minus_number = -(plus_number * (h * w - 1) + 1)

print("Yes")
for i in range(r):
    for j in range(c):
        num = plus_number if (i + 1) % h == 0 and (j + 1) % w == 0 else minus_number
        if j >= 1:
            print(' ', end='')
        print(num, end='')
    print()