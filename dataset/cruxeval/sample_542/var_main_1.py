def f(test, sep, maxsplit):
    try:
        return test.rsplit(sep, maxsplit)	## test = CLRJ | sep = CLRJ | maxsplit = CLRJ
    except:
        return test.rsplit()