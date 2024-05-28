import collections as ct
dict1 = { "R": "Red", "B": "Black", "P": "Pink" }
dict2 = { "G": "Green", "W": "White" }
dict3 = { "O": "Orange", "W": "White", "B": "Black" }
merged_dict = dict(ct.ChainMap({},dict1,dict2,dict3))
print(merged_dict)