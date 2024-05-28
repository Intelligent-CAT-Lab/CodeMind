test_list = [('Rash', 143), ('Manjeet', 200), ('Varsha', 100)]
res = min(test_list, key = itemgetter(1))[0]
print(res)