import sys

def reverse_string(s):
    return s[::-1]

def mod(a, b):
    if a < 0:
        a += b
    return a % b

def power_with_mod(k, j, p):
    ans = 1
    while j > 0:
        if j % 2 == 0:
            ans *= ans * k % p
            j //= 2
        else:
            ans *= ans * k
            j -= 1
    return ans % p

N = int(input())
amari = N % 10
sho = N // 10

if amari == 9:
    print("Yes")
elif sho == 9:
    print("Yes")
else:
    print("No")