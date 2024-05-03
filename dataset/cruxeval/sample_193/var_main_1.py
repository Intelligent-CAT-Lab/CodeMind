def f(string):
    count = string.count(':')	## count = CLRJ | string = CLRJ
    return string.replace(':', '', count - 1)	## string = CLRJ | count = CLRJ
