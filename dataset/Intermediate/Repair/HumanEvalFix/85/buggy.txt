def add(lst):
    return sum([lst[i] for i in range(1, len(lst), 1) if lst[i]%2 == 0])
