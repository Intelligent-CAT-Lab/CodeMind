a = raw_input()
ans = 0
for i in range(len(a)):
  if a[i] == "0" and i != len(a) - 1:
    continue
  a1 = int(a[:i]) if i else 0
  a2 = int(a[i:])
  if a1 <= a2 and a1 % 2 == a2 % 2:
    ans += 1
print ans