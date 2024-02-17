dict0 = {2: 5, 4: 1, 3: 5, 1: 3, 5: 1}
new = dict0.copy()
for i in range(len(new)-1):
    dict0[sorted(new)[i]] = i
print(dict0)