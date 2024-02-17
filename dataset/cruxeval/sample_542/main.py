def f(test, sep, maxsplit):
    try:
        return test.rsplit(sep, maxsplit)
    except:
        return test.rsplit()