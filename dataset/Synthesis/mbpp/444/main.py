def trim_tuple(test_list, K):
  res = []
  for ele in test_list:
    N = len(ele)
    res.append(tuple(list(ele)[K: N - K]))
  return (str(res)) 