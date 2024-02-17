test_tup1 = ((1, 3), (4, 5), (2, 9), (1, 10))
test_tup2 = ((6, 7), (3, 9), (1, 1), (7, 3))

res = tuple(tuple(a + b for a, b in zip(tup1, tup2))
 for tup1, tup2 in zip(test_tup1, test_tup2))

print(res)