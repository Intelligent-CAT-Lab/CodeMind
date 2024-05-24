test_tup1 = (10, 4, 5)
test_tup2 = (2, 5, 18)
res = tuple(map(lambda i, j: i - j, test_tup1, test_tup2))
print(res)