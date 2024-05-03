def f(test, sep, maxsplit):
    try:
        return test.rsplit(sep, maxsplit)	## {"test" : '',"sep" : '',"maxsplit" : ''}
    except:
        return test.rsplit()