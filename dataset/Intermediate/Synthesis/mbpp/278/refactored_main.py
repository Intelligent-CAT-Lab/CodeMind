test_tup = (1, 5, 7, (4, 6), 10)
for count, ele in enumerate(test_tup):
  if isinstance(ele, tuple):
    break
print(count)