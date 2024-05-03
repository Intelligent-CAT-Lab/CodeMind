def f(d):
    key1 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## key1 = [] | d = [] | x = []
    val1 = d.pop(key1)	## val1 = [] | d = [] | key1 = []
    key2 = sorted(d.items(), key=lambda x: x[0], reverse=True)[0][0]	## key2 = [] | d = [] | x = []
    val2 = d.pop(key2)	## val2 = [] | d = [] | key2 = []
    return dict({key1: val1, key2: val2})	## key1 = [] | key2 = [] | val1 = [] | val2 = []
