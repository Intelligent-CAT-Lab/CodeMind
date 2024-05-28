test_list = [(5, 3, 2, 1, 4), (3, 4, 9, 2, 1),(9, 1, 2, 3, 5), (4, 8, 2, 1, 7)]
K = 2
res = []
for ele in test_list:
    N = len(ele)
    res.append(tuple(list(ele)[K: N - K]))
print(str(res))