def find_tuples(test_list, K):
  res = [sub for sub in test_list if all(ele % K == 0 for ele in sub)]
  return res
find_tuples([(6, 24, 12), (7, 9, 6), (12, 18, 21)], 6)