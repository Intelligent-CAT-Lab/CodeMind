def gcd(a, b):
    return b if a == 0 else gcd(b%a, a)
num = [int(x) for x in input().split(" ")]
print(int(num[0]*num[1]/gcd(num[0], num[1])))