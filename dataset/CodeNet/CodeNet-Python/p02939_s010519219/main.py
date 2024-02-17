s = input()
t = ''
k = 0
prev = ''
for i in range(len(s)):
  t += s[i]
  if prev != t:
    k += 1
    prev = t
    t = ''
print(k)
