import math

def atcoder_ABC136_B():
    N = int(input())
    count = 0
    temp = N
    ans = 0

    while temp > 0:
        temp //= 10
        count += 1

    for i in range(1, count + 1):
        if i == count:
            if i % 2 == 1:
                ans += (N - pow(10, i - 1) + 1)
        else:
            if i == 1:
                ans += 9
            elif i % 2 == 1:
                ans += (pow(10, i) - pow(10, i - 1))

    print(ans)

atcoder_ABC136_B()