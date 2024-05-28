def check_distinct(test_tup):
  res = True
  temp = set()
  for ele in test_tup:
    if ele in temp:
      res = False
      break
    temp.add(ele)
  return res 