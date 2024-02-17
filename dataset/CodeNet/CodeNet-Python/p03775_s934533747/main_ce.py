import math
# input
N = int("10000")
i = int(math.sqrt(N))
while i > 0:
    if N % i == 0:
        print(len(str(N // i)))
        break
    else:
        i -= 1