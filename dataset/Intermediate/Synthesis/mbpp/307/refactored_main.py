from copy import deepcopy
tuplex = ("HELLO", 5, [], True)
m = 2
n = 50
tuplex_colon = deepcopy(tuplex)
tuplex_colon[m].append(n)
print(tuplex_colon)