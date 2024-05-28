test_tup = (1, 4, 5, 6, 1, 4)
res = True
temp = set()
for ele in test_tup:
  if ele in temp:
    res = False
    break
  temp.add(ele)
print(res)