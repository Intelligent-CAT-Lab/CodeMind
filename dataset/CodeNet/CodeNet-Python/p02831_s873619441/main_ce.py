def gcd(a, b):
    return b if a == 0 else gcd(b%a, a)
num = [int(x) for x in "2 3".split(" ")]
print(int(num[0]*num[1]/gcd(num[0], num[1])))