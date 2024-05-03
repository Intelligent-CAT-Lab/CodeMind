def f(query, base):
    net_sum = 0	## <state>net_sum = CLRJ</state>
    for (key, val) in base.items():	## <state>base = CLRJ</state>
        if key[0] == query and len(key) == 3:
            net_sum -= val
        elif key[-1] == query and len(key) == 3:
            net_sum += val
    return net_sum	## <state>net_sum = CLRJ</state>
