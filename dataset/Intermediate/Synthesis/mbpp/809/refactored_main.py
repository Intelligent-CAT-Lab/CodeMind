test_tup1 = (1, 2, 3)
test_tup2 = (2, 3, 4)
print(all(x > y for x, y in zip(test_tup1, test_tup2)))