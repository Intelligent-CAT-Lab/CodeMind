test_tup = (1, 5, 7, (4, 6), 10)
res = tuple()
for count, ele in enumerate(test_tup):
  if not isinstance(ele, tuple):
    res = res + (ele, )
print(res)