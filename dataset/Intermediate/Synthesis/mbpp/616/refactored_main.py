test_tup1 = (10, 4, 5, 6)
test_tup2 = (5, 6, 7, 5)
res = tuple(ele1 % ele2 for ele1, ele2 in zip(test_tup1, test_tup2)) 
print(res)