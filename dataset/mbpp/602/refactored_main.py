str1 = "abcabc"
for index,c in enumerate(str1):
  if str1[:index+1].count(c) > 1:
    tmp = c
    break
print(tmp)