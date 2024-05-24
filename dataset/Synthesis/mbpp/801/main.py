def test_three_equal(x,y,z):
  result = set([x,y,z])
  if len(result)==3:
    return 0
  else:
    return 4-len(result)