def min_k(test_list, K):
  res = sorted(test_list, key = lambda x: x[1])[:K]
  return (res) 