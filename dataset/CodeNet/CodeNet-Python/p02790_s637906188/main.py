a, b = map(int, input().split())
s1 = str(a)*b
s2 = str(b)*a
print(sorted([s1,s2])[0])