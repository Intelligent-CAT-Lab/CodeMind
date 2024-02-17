from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))
