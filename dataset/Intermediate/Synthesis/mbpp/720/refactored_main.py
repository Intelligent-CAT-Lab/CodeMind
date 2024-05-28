test_tup = (4, 5, 6)
test_dict = {"MSAM" : 1, "is" : 2, "best" : 3}
test_tup = list(test_tup)
test_tup.append(test_dict)
test_tup = tuple(test_tup)
print(test_tup)