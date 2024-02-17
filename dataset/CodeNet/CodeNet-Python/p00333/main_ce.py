from math import gcd
W, H, C = map(int, "10 20 5".split())
g = gcd(W, H)
print(W*H*C//(g*g))
