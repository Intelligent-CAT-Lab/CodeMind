def f(single_digit):
    result = []
    for c in range(1, 11):
        if c != single_digit:
            result.append(c)
    return result