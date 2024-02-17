def f(sequence, value):
    i = max(sequence.index(value) - len(sequence) // 3, 0)
    result = ''
    for j, v in enumerate(sequence[i:]):
        if v == '+':
            result += value
        else:
            result += sequence[i + j]
    return result