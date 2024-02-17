def f(text, new_ending):
    result = list(text)
    result.extend(new_ending)
    return ''.join(result)