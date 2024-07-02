def f(items):
    result = []
    for item in items:
        for d in item:
            if not d.isdigit():
                result.append(d)
    return result
f(['123', 'cat', 'd dee'])