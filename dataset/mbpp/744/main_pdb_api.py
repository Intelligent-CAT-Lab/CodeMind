def check_none(test_tup):
  res = any(map(lambda ele: ele is None, test_tup))
  return res 
check_none((10, 4, 5, 6, None))