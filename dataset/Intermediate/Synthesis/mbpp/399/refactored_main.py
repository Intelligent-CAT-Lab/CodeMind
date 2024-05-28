test_tup1 = (10, 4, 6, 9)
test_tup2 = (5, 2, 3, 3)
res = tuple(ele1 ^ ele2 for ele1, ele2 in zip(test_tup1, test_tup2))
print(res)