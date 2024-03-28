a,b = map(int,input().split())
print(bin(a&b)[2:])
print(bin(a|b)[2:])
print(bin(a^b)[2:])