import math

def get_ans(x):
    for i in range(100000):
        if x <= i * (i + 1) // 2:
            return i
    return -1

x = int(input())
ans = get_ans(x)
print(ans)



>>> x = 6
>>> ans = get_ans(x)
>>> print(ans)
3