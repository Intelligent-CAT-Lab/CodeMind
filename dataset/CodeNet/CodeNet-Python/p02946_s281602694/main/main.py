n = list(map(int, input().split()))
k = n[0]
x = n[1]
s1 = x - k + 1
s2 = x + k - 1
a1 = list(range( (s1), (s2 + 1)  ))
print((" ".join(list(map(str, a1)))))