def f(query, base):
    net_sum = 0	## net_sum = CLRJ
    for (key, val) in base.items():	## base = CLRJ
        if key[0] == query and len(key) == 3:
            net_sum -= val
        elif key[-1] == query and len(key) == 3:
            net_sum += val
    return net_sum	## net_sum = CLRJ
