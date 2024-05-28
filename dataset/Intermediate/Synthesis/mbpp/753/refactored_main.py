test_list = [('Manjeet', 10), ('Akshat', 4), ('Akash', 2), ('Nikhil', 8)]
K = 2
res = sorted(test_list, key = lambda x: x[1])[:K]
print(res)