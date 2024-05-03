def f(a):
    s = dict(list(a.items())	## <state>s = CLRJ | a = CLRJ</state>
    [::-1])
    return " ".join([str(i) for i in s.items()])	## <state>i = CLRJ | s = CLRJ</state>
