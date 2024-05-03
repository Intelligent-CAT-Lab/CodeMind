def f(stg, tabs):
    for tab in tabs:	## <state>tab = CLRJ | tabs = CLRJ</state>
        stg = stg.rstrip(tab)	## <state>stg = CLRJ | tab = CLRJ</state>
    return stg	## <state>stg = CLRJ</state>
