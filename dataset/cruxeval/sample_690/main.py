def f(n):
    if str(n).find('.') != -1:
        return str(int(n)+2.5)
    return str(n)