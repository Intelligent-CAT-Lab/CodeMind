s = eval(input())
a = len(s)
c = 10000
for i in range(a-2):
  c = min(c,abs(753-int(s[i:i+3])))
print(c)