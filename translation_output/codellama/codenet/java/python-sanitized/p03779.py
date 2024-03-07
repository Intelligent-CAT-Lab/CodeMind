import math

def get_ans(x):
    for i in range(100000):
        if x <= i * (i + 1) // 2:
            return i
    return 0

x = int(input("Enter a number: "))
ans = get_ans(x)
print(ans)