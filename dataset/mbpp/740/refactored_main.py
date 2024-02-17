test_tup = (1, 5, 7, 10, 13, 5)
res = dict(test_tup[idx : idx + 2] for idx in range(0, len(test_tup), 2))
print(res)