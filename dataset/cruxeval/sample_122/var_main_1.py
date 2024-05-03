def f(string):
    if string[:4] != 'Nuva':	## string = CLRJ
        return 'no'
    else:
        return string.rstrip()	## string = CLRJ
