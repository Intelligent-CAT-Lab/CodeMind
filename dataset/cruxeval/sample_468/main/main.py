def f(a, b, n):
    result = m = b
    for _ in range(n):
        if m:
            a, m = a.replace(m, '', 1), None
            result = m = b
    return result.join(a.split(b))