def find_dissimilar(test_tup1, test_tup2):
  res = tuple(set(test_tup1) ^ set(test_tup2))
  return (res) 
find_dissimilar((3, 4, 5, 6), (5, 7, 4, 10))