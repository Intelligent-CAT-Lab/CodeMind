def f(no):
    d = dict.fromkeys(no, False) 	## <state>d = CLRJ | no = CLRJ</state>
    return sum([1 for i in d.keys()])	## <state>i = CLRJ | d = CLRJ</state>
