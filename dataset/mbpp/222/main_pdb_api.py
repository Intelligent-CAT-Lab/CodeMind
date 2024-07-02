def check_type(test_tuple):
  res = True
  for ele in test_tuple:
    if not isinstance(ele, type(test_tuple[0])):
      res = False
      break
  return (res) 
check_type((5, 6, 7, 3, 5, 6) )