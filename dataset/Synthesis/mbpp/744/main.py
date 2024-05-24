def check_none(test_tup):
  res = any(map(lambda ele: ele is None, test_tup))
  return res 