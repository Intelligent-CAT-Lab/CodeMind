def f(d):
    sorted_pairs = sorted(list(d.items()), key=lambda x: len(str(str(x[0])+str(x[1]))))	## {"sorted_pairs" : '',"d" : '',"x" : ''}
    return [(k, v) for k, v in sorted_pairs if k < v]	## {"k" : '',"v" : '',"sorted_pairs" : ''}
    return ret