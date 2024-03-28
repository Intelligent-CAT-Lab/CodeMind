def check(num, c):
    num_str = str(num)
    num_str += c + num_str[::-1]
    if is_prime(int(num_str)):
        return True
    return False

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5)+1):
        if num % i == 0:
            return False
    return True

n = int(input())
c = int(input())
num = [0] * n
if c < 0:
    if n == 1:
        print("11")
    else:
        for i in range(n*2):
            print("9", end="")
        print()
else:
    a = 1
    for i in range(n):
        a *= 10
    b = a // 10
    a -= 1
    for i in range(a, b-1, -1):
        if check(i, c):
            return

print(num)