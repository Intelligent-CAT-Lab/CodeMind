test_tuple = (5, 6, 7, 3, 5, 6)
res = True
for ele in test_tuple:
  if not isinstance(ele, type(test_tuple[0])):
    res = False
    break
print(res)