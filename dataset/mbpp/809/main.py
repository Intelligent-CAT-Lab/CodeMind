def check_smaller(test_tup1, test_tup2):
  return all(x > y for x, y in zip(test_tup1, test_tup2))