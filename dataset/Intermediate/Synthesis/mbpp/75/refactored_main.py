test_list = [(6, 24, 12), (7, 9, 6), (12, 18, 21)]
K = 6
res = [sub for sub in test_list if all(ele % K == 0 for ele in sub)]
print(res)