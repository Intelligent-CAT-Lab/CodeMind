def f(doc):
    for x in doc:	## <state>x = CLRJ | doc = CLRJ</state>
        if x.isalpha():	## <state>x = CLRJ</state>
            return x.capitalize()	## <state>x = CLRJ</state>
    return '-'