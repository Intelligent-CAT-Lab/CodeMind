def f(query, base):
    net_sum = 0	## net_sum = []
    for (key, val) in base.items():	## base = []
        if key[0] == query and len(key) == 3:
            net_sum -= val
        elif key[-1] == query and len(key) == 3:
            net_sum += val
    return net_sum	## net_sum = []
