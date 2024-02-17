ets = {}
while ets:
    k, v = ets.popitem()
    ets[k] = v**2
print(ets)