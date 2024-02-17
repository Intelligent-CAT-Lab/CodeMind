import math

# input
N = int(input())

i = int(math.sqrt(N))

while i > 0:
    if N % i == 0:
        print(len(str(N // i)))
        break
    else:
        i -= 1