import math

def get_ans(x):
    i = 0
    while i * (i + 1) / 2 <= x:
        i += 1
    return i - 1

x = int(input())
print(get_ans(x))