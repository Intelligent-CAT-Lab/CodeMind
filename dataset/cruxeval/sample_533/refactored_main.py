query = 'a'
base = {}

net_sum = 0
for (key, val) in base.items():
    if key[0] == query and len(key) == 3:
        net_sum -= val
    elif key[-1] == query and len(key) == 3:
        net_sum += val
print(net_sum)