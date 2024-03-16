import sys

fact = 1
mul = 1

for i in range(1, 1511):
    fact *= mul
    mul += 1

fact += 2

while True:
    try:
        n = int(sys.stdin.readline())
        print(fact)
        for i in range(2, 2 + n):
            print(i)
    except:
        break