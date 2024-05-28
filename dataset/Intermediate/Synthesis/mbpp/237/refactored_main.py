test_list = [(3, 1), (1, 3), (2, 5), (5, 2), (6, 3)]
res = dict(Counter(tuple(ele) for ele in map(sorted, test_list)))
print(res)