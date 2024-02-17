test_tup = (10, 4, 5, 6, None)
res = any(map(lambda ele: ele is None, test_tup))
print(res)