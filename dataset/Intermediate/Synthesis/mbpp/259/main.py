def maximize_elements(test_tup1, test_tup2):
  res = tuple(tuple(max(a, b) for a, b in zip(tup1, tup2))
   for tup1, tup2 in zip(test_tup1, test_tup2))
  return (res) 