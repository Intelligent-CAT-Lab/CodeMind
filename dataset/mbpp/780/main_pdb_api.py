from itertools import combinations 
def find_combinations(test_list):
  res = [(b1 + a1, b2 + a2) for (a1, a2), (b1, b2) in combinations(test_list, 2)]
  return (res) 
find_combinations([(2, 4), (6, 7), (5, 1), (6, 10)])