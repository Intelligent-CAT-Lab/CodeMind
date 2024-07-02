def list_to_float(test_list):
  res = []
  for tup in test_list:
    temp = []
    for ele in tup:
      if ele.isalpha():
        temp.append(ele)
      else:
        temp.append(float(ele))
    res.append((temp[0],temp[1])) 
  return res
list_to_float( [("3", "4"), ("1", "26.45"), ("7.32", "8"), ("4", "8")] )