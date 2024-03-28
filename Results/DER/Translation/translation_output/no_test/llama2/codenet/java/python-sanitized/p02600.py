import sys

x = int(sys.stdin.readline())

if 400 <= x < 600:
    k = 8
elif 600 <= x < 800:
    k = 7
elif 800 <= x < 1000:
    k = 6
elif 1000 <= x < 1200:
    k = 5
elif 1200 <= x < 1400:
    k = 4
elif 1400 <= x < 1600:
    k = 3
elif 1600 <= x < 1800:
    k = 2
elif 1800 <= x <= 1999:
    k = 1

print(k)