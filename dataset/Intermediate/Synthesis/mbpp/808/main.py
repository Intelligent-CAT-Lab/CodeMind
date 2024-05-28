def check_K(test_tup, K):
  res = False
  for ele in test_tup:
    if ele == K:
      res = True
      break
  return res 