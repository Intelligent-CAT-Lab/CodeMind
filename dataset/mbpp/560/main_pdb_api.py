def union_elements(test_tup1, test_tup2):
  res = tuple(set(test_tup1 + test_tup2))
  return (res) 
union_elements((3, 4, 5, 6),(5, 7, 4, 10) )