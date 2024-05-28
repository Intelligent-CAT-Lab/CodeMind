test_list = [(3, 4), (1, 2), (4, 3), (5, 6)]
res = len(list(set(tuple(sorted(sub)) for sub in test_list)))
print(res)