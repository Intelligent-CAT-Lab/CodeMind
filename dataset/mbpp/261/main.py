def division_elements(test_tup1, test_tup2):
  res = tuple(ele1 // ele2 for ele1, ele2 in zip(test_tup1, test_tup2))
  return (res) 