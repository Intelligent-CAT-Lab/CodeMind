def f(test, sep, maxsplit):
    try:
        return test.rsplit(sep, maxsplit)	## <state>test = CLRJ | sep = CLRJ | maxsplit = CLRJ</state>
    except:
        return test.rsplit()