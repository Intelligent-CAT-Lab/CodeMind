def check(num):
  if num == "":return False
  if num[0] == "0":return num == "0"
  return 0 <= int(num) <= 255
s = input()
ans = 0
for i in range(1, 4):
  for j in range(1, 4):
    for k in range(1, 4):
      n1 = s[:i]
      n2 = s[i:i+j]
      n3 = s[i+j:i+j+k]
      n4 = s[i+j+k:]
      if check(n1) and check(n2) and check(n3) and check(n4):ans += 1
print(ans)
