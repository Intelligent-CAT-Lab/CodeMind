s1 = 'abcdefghabc'
s2 = 'abc'
res = []
i = s1.rfind(s2)
while i != -1:
    res.append(i+len(s2)-1)
    i = s1.rfind(s2, 0, i)
print(res)