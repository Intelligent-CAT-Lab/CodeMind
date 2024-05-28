test_tup = ("ID", "is", 4, "UTS")
delim = "-"
res = ''.join([str(ele) + delim for ele in test_tup])
res = res[ : len(res) - len(delim)]
print(str(res))