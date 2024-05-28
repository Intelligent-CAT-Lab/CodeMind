test_list = [(3, 5), (1, 7), (10, 3), (1, 2)]
temp = [abs(b - a) for a, b in test_list]
res = max(temp)
print(res)