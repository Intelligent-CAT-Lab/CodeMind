def f(tags):
    resp = ""	## <state>resp = CLRJ</state>
    for key in tags:	## <state>key = CLRJ | tags = CLRJ</state>
        resp += key + " "	## <state>resp = CLRJ | key = CLRJ</state>
    return resp	## <state>resp = CLRJ</state>
