def f(dictionary, key):
    del dictionary[key]	## <state>dictionary = CLRJ | key = CLRJ</state>
    if min(dictionary) == key:	## <state>dictionary = CLRJ | key = CLRJ</state>
        key = list(dictionary)[0]
    return key	## <state>key = CLRJ</state>
