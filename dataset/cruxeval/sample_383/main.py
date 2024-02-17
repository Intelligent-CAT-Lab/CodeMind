def f(text, chars):
    result = list(text)
    while chars in result[-3::-2]:
        result.remove(result[-3])
        result.remove(result[-3])
    return ''.join(result).strip('.')