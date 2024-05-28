test_list = ["julia", "best", "tseb", "for", "ailuj"]
res = sum([1 for idx in range(0, len(test_list)) for idxn in range(idx, len(test_list)) if test_list[idxn] == str(''.join(list(reversed(test_list[idx]))))]) 
print(res)