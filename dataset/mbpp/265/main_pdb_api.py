def list_split(S, step):
    return [S[i::step] for i in range(step)]
list_split(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'],3)